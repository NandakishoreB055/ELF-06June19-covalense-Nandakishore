package com.covalense.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.covalense.springboot.dto.EmployeeAddresInfoBean;
import com.covalense.springboot.dto.EmployeeEducationInfoBean;
import com.covalense.springboot.dto.EmployeeExperinceInfoBean;
import com.covalense.springboot.dto.EmployeeInfoBean;
import com.covalense.springboot.dto.EmployeeOtherInfoBean;
import com.covalense.springboot.dto.EmployeeResponse;
import com.covalense.springboot.repository.EmployeeRepository;

@RestController
@EntityScan(basePackages = "com.covalense")

public class EmployeeController {

	@Autowired
	EmployeeRepository repository;

	@GetMapping(path = "/hello", produces = MediaType.TEXT_PLAIN_VALUE)
	public String helloWorld() {
		return "Helloworld!!!";
	}

	@PostMapping(path = "/create", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse createEmp(@RequestBody EmployeeInfoBean bean) {
		List<EmployeeEducationInfoBean> eduInfobean = bean.getEduInfobean();
		for (EmployeeEducationInfoBean educationInfoBean : eduInfobean) {
			educationInfoBean.getEduPk().setInfoBean(bean);
		}

		List<EmployeeAddresInfoBean> addressInfobean = bean.getAddressInfobean();
		for (EmployeeAddresInfoBean employeeAddresInfoBean : addressInfobean) {
			employeeAddresInfoBean.getEmpPK().setInfoBean(bean);
			System.out.println("address info " + employeeAddresInfoBean.getEmpPK().getAddresType());

		}

		List<EmployeeExperinceInfoBean> expInfobean = bean.getExpInfobean();
		for (EmployeeExperinceInfoBean employeeExperinceInfoBean : expInfobean) {
			employeeExperinceInfoBean.getEmpExp().setInfoBean(bean);

		}
		EmployeeOtherInfoBean empotherinfo = bean.getOtherInfo();
		empotherinfo.setOtherinfobean(bean);

		EmployeeInfoBean manager = bean.getManagerId();
		manager = repository.findById(manager.getId()).get();
		bean.setManagerId(manager);

		EmployeeResponse response = new EmployeeResponse();
		if (!repository.existsById(bean.getId())) {
			EmployeeInfoBean infoBean = new EmployeeInfoBean();
			response.setStatusCode(201);
			repository.save(bean);
			response.setMessage("successfull");
			response.setDecription("Employee data inserted successfully ");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDecription("Employee data not inserted");
		}
		return response;
	}

	@PutMapping(path = "/update", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse updateEmp(@RequestBody EmployeeInfoBean bean) {
		List<EmployeeEducationInfoBean> eduInfobean = bean.getEduInfobean();
		for (EmployeeEducationInfoBean educationInfoBean : eduInfobean) {
			educationInfoBean.getEduPk().setInfoBean(bean);
		}

		List<EmployeeAddresInfoBean> addressInfobean = bean.getAddressInfobean();
		for (EmployeeAddresInfoBean employeeAddresInfoBean : addressInfobean) {
			employeeAddresInfoBean.getEmpPK().setInfoBean(bean);
		}

		List<EmployeeExperinceInfoBean> expInfobean = bean.getExpInfobean();
		for (EmployeeExperinceInfoBean employeeExperinceInfoBean : expInfobean) {
			employeeExperinceInfoBean.getEmpExp().setInfoBean(bean);
			;
		}
		EmployeeOtherInfoBean empotherinfo = bean.getOtherInfo();
		empotherinfo.setOtherinfobean(bean);

		EmployeeInfoBean manager = bean.getManagerId();
		manager = repository.findById(manager.getId()).get();
		bean.setManagerId(manager);

		EmployeeResponse response = new EmployeeResponse();
		if (repository.existsById(bean.getId())) {
			response.setStatusCode(201);
			repository.save(bean);
			response.setMessage("successfull");
			response.setDecription("Employee data inserted successfully ");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDecription("Employee data not inserted");
		}
		return response;
	}

	@GetMapping(path = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmp(@RequestParam int id) {

		EmployeeResponse response = new EmployeeResponse();
		if (repository.existsById(id)) {
			EmployeeInfoBean bean = repository.findById(id).get();

			response.setStatusCode(201);
			response.setMessage("successfull");
			response.setDecription("Employee data found successfully ");
			response.setBeans(Arrays.asList(bean));
			return response;
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDecription("Employee data not  found");
		}
		return response;

	}

	@DeleteMapping(path = "/delete", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse deleteEmp(@RequestParam int id) {

		EmployeeResponse response = new EmployeeResponse();
		EmployeeInfoBean bean = repository.findById(id).get();
		if (bean != null) {
			repository.delete(bean);
			response.setStatusCode(201);
			response.setMessage("successfull");
			response.setDecription("Employee data Deleted successfully ");

			return response;
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDecription("Employee data not Deleted found");
		}
		return response;

	}
}
