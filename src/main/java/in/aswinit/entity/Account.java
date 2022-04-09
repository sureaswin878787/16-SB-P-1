package in.aswinit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="bank_accounts")
@IdClass(AccountPK.class)
public class Account {
	@Id
	@Column(name="acc_id")
	private Integer accId;
	
	@Id
	@Column(name="acc_name")
	private String accHolderName;
	
	@Id
	@Column(name="acc_type")
	private String accType;
	
	@Column(name="min_bal")
	private Double minBal;
	
	@Column(name="branch_name")
	private String branchName;
	@Override
	public String toString() {
		return "Account [accId=" + accId + ", accHolderName=" + accHolderName + ", accType=" + accType + ", minBal="
				+ minBal + ", branchName=" + branchName + "]";
	}
	public Integer getAccId() {
		return accId;
	}
	public void setAccId(Integer accId) {
		this.accId = accId;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public Double getMinBal() {
		return minBal;
	}
	public void setMinBal(Double minBal) {
		this.minBal = minBal;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	
}
