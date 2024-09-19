package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {

	private Integer numbner;
	private LocalDate date;
	private Double totalValue;
	
	private List<Installment> installments = new ArrayList<Installment>();
	
	public Contract() {
	}

	public Contract(Integer numbner, LocalDate date, Double totalValue) {
		this.numbner = numbner;
		this.date = date;
		this.totalValue = totalValue;
	}

	public Integer getNumbner() {
		return numbner;
	}

	public void setNumbner(Integer numbner) {
		this.numbner = numbner;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public List<Installment> getInstallments() {
		return installments;
	}

	
	
}
