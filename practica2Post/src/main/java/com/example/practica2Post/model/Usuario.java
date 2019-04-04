package com.example.practica2Post.model;

import java.util.List;

public class Usuario {
	private String accountId; 
	private String accountStatus;
	private String alias;
	private String competitorFlag;
	private String currencyCode;
	private String expertise;
	private List<accountEmail>accountEmails;
	private List<accountPhone>accountPhones;
	private List<businessAddress>businessAddresses;
	private String perfilPago;
	private String mainPhoneNumber;
	private String name;
	private String partnerFlag;
	private String priceList;
	private String priceListId;
	private String primaryOrganization;
	private String skipCreditCheck;
	private String subscriberType;
	private String ttGiroNegocio;
	private String type;
	private boolean vatregistration;
	
	
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getCompetitorFlag() {
		return competitorFlag;
	}
	public void setCompetitorFlag(String competitorFlag) {
		this.competitorFlag = competitorFlag;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getExpertise() {
		return expertise;
	}
	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}
	public List<accountEmail> getAccountEmails() {
		return accountEmails;
	}
	public void setAccountEmails(List<accountEmail> accountEmails) {
		this.accountEmails = accountEmails;
	}
	public List<accountPhone> getAccountPhones() {
		return accountPhones;
	}
	public void setAccountPhones(List<accountPhone> accountPhones) {
		this.accountPhones = accountPhones;
	}
	public List<businessAddress> getBusinessAddresses() {
		return businessAddresses;
	}
	public void setBusinessAddresses(List<businessAddress> businessAddresses) {
		this.businessAddresses = businessAddresses;
	}
	public String getPerfilPago() {
		return perfilPago;
	}
	public void setPerfilPago(String perfilPago) {
		this.perfilPago = perfilPago;
	}
	public String getMainPhoneNumber() {
		return mainPhoneNumber;
	}
	public void setMainPhoneNumber(String mainPhoneNumber) {
		this.mainPhoneNumber = mainPhoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPartnerFlag() {
		return partnerFlag;
	}
	public void setPartnerFlag(String partnerFlag) {
		this.partnerFlag = partnerFlag;
	}
	public String getPriceList() {
		return priceList;
	}
	public void setPriceList(String priceList) {
		this.priceList = priceList;
	}
	public String getPriceListId() {
		return priceListId;
	}
	public void setPriceListId(String priceListId) {
		this.priceListId = priceListId;
	}
	public String getPrimaryOrganization() {
		return primaryOrganization;
	}
	public void setPrimaryOrganization(String primaryOrganization) {
		this.primaryOrganization = primaryOrganization;
	}
	public String getSkipCreditCheck() {
		return skipCreditCheck;
	}
	public void setSkipCreditCheck(String skipCreditCheck) {
		this.skipCreditCheck = skipCreditCheck;
	}
	public String getSubscriberType() {
		return subscriberType;
	}
	public void setSubscriberType(String subscriberType) {
		this.subscriberType = subscriberType;
	}
	public String getTtGiroNegocio() {
		return ttGiroNegocio;
	}
	public void setTtGiroNegocio(String ttGiroNegocio) {
		this.ttGiroNegocio = ttGiroNegocio;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isVatregistration() {
		return vatregistration;
	}
	public void setVatregistration(boolean vatregistration) {
		this.vatregistration = vatregistration;
	}	
		
}
