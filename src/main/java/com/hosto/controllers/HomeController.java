package com.hosto.controllers;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.hosto.models.Area;
import com.hosto.models.Cfdi;
import com.hosto.models.Directivo;
import com.hosto.models.Empresa;
import com.hosto.models.Odc;
import com.hosto.models.Proveedor;
import com.hosto.models.Req;
import com.hosto.models.Status;
import com.hosto.models.Usuario;
import com.hosto.service.IAreaService;
import com.hosto.service.ICfdiService;
import com.hosto.service.IDirectivoService;
import com.hosto.service.IEmpresaService;
import com.hosto.service.IOdcService;
import com.hosto.service.IPerfilService;
import com.hosto.service.IProveedorService;
import com.hosto.service.IReqService;
import com.hosto.service.IStatusService;
import com.hosto.service.IUsuarioService;

@Controller
public class HomeController {

	@Autowired
	private IOdcService odcService;

	@Autowired
	private IReqService reqservice;

	@Autowired
	private IEmpresaService empresaservice;;

	@Autowired
	private IAreaService areaservice;

	@Autowired
	private ICfdiService cfdiservice;

	@Autowired
	private IDirectivoService directivoservice;

	@Autowired
	private IStatusService statusservice;

	@Autowired
	private IUsuarioService usuarioService;

	@Autowired
	private IProveedorService proveedorService;

	@Autowired
	private IPerfilService perfilService;

	Date date = new Date();
	Calendar calendar = Calendar.getInstance();

	@GetMapping("/")
	public String index(Model model) {
		calendar.setTime(date);
		int dateYear = calendar.get(Calendar.YEAR);
		model.addAttribute("fecha", dateYear);

		return "login";
	}

	@GetMapping("/reqs")
	public String home(Model m, @RequestParam String filtro) {

		calendar.setTime(date);
		int dateYear = calendar.get(Calendar.YEAR);

		m.addAttribute("reqs", reqservice.findAllByQuery(filtro));
		m.addAttribute("fecha", dateYear);

		return "home";

	}

	@GetMapping("/odc")
	public String odc(Model m, @RequestParam int filtro) {

		m.addAttribute("odcs", odcService.findAllByQuery(filtro));
		calendar.setTime(date);
		int dateYear = calendar.get(Calendar.YEAR);
		m.addAttribute("fecha", dateYear);

		return "odc";
	}

	@GetMapping("/newreq")
	public String newreq(Model model, @ModelAttribute Req req) {

		List<Empresa> empresas = empresaservice.listarTodos();

		model.addAttribute("empresas", empresas);
		model.addAttribute("req", req);

		return "newreq";

	}

	@PostMapping("/savereq")
	public String saveReq(@ModelAttribute Req req) {

		try {
			reqservice.guardarReq(req);
			System.out.println("registro guardado con exito!");

		} catch (Exception e) {
			System.out.println("Algo fallo y no se pudo guardar el registro ");
		}

		return "redirect:/?filtro=z";

	}

	@GetMapping("/newodc")
	public String newodc(Model model) {

		Odc odc = new Odc();

		List<Area> areas = areaservice.listarTodos();
		List<Cfdi> cfdis = cfdiservice.listarTodos();
		List<Directivo> directivos = directivoservice.listarTodos();
		List<Req> reqs = reqservice.listarTodos();
		List<Status> status = statusservice.listarTodos();
		List<Usuario> usuarios = usuarioService.listarTodos();
		List<Proveedor> proveedores = proveedorService.listarTodos();

		model.addAttribute("areas", areas);
		model.addAttribute("cfdis", cfdis);
		model.addAttribute("directivos", directivos);
		model.addAttribute("reqs", reqs);
		model.addAttribute("status", status);
		model.addAttribute("odc", odc);
		model.addAttribute("usuarios", usuarios);
		model.addAttribute("prov", proveedores);

		return "newodc";

	}

	@GetMapping("/newuser")
	public String newUser(Model model) {
		Usuario usuario = new Usuario();
		List<Area> areas = areaservice.listarTodos();
		model.addAttribute("perfil", perfilService.listarTodos());
		model.addAttribute("usuario", usuario);
		model.addAttribute("area", areas);
		return "newuser";
	}



	@PostMapping("/saveuser")
	public String saveUser(@ModelAttribute Usuario usuario){


		usuarioService.guardarUsuario(usuario);
	

		return "temp";

	}

	@PostMapping("/saveodc")
	public String saveOdc(@ModelAttribute Odc odc, @ModelAttribute Req req) {

		odcService.guardar(odc);

		return "redirect:/odc?filtro=" + req.getId_req();

	}

	@GetMapping("/deleteodc/{id}")
	public String eliminar(@PathVariable("id") Long id) {

		odcService.eliminar(id);
		
		
		return "redirect:/odc?filtro=2";
	}



	@GetMapping("/detalleodc/{id}")
	public String detalleodc(@PathVariable Long id, Model model, RedirectAttributes flash, @ModelAttribute Req req) {

		Odc detalleOdc = odcService.buscarPorId(id);

		if (detalleOdc == null) {
			flash.addFlashAttribute("error", "La ODC no existe en la base de datos!");
			return "redirect:/odc?filtro=" + req.getId_req();
		}
		model.addAttribute("odc", detalleOdc);
		model.addAttribute("titulo", "Detalle de la Orden de Compra:");

		return "detalleodc";
	}

	@GetMapping("/login")
	public String login() {

		return "login";
	}

}
