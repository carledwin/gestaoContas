package com.carledwinj.gestaocontas.restcontroller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carledwinj.gestaocontas.enums.StatusEnum;
import com.carledwinj.gestaocontas.model.Conta;

@RequestMapping("/contas")
@RestController
public class ContaRestController {

	@GetMapping("/todas")
	public ResponseEntity<?> todas(){
		
		try {
			
			List<Conta> contas = new ArrayList<Conta>();
			Conta conta = new Conta();
			conta.setId(1);
			conta.setTitulo("Água");
			conta.setValor(new BigDecimal("60.87"));
			conta.setStatus(StatusEnum.A_VENCER);
			
			Conta conta2 = new Conta();
			conta2.setId(2);
			conta2.setTitulo("Luz");
			conta2.setValor(new BigDecimal("123.56"));
			conta2.setStatus(StatusEnum.A_VENCER);
			
			contas.add(conta);
			contas.add(conta2);
			
			return new ResponseEntity<List<Conta>>(contas, HttpStatus.OK);
		} catch (Exception e) {
			
			return new ResponseEntity<String>("Falha ao tentar consultar todas as contas.", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
