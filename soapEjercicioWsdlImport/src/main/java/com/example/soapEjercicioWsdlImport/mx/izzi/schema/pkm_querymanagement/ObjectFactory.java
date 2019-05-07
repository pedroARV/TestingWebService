
package com.example.soapEjercicioWsdlImport.mx.izzi.schema.pkm_querymanagement;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mx.izzi.schema.pkm_querymanagement package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListProducts_QNAME = new QName("http://www.izzi.mx/Schema/PKM_QueryManagement", "listProducts");
    private final static QName _InitDate_QNAME = new QName("http://www.izzi.mx/Schema/PKM_QueryManagement", "initDate");
    private final static QName _GetProductsRequest_QNAME = new QName("http://www.izzi.mx/Schema/PKM_QueryManagement", "getProductsRequest");
    private final static QName _CreateAdjustmentResponse_QNAME = new QName("http://www.izzi.mx/Schema/PKM_QueryManagement", "createAdjustmentResponse");
    private final static QName _Amount_QNAME = new QName("http://www.izzi.mx/Schema/PKM_QueryManagement", "amount");
    private final static QName _AccountNumber_QNAME = new QName("http://www.izzi.mx/Schema/PKM_QueryManagement", "accountNumber");
    private final static QName _Message_QNAME = new QName("http://www.izzi.mx/Schema/PKM_QueryManagement", "message");
    private final static QName _CreateAdjustmentRequest_QNAME = new QName("http://www.izzi.mx/Schema/PKM_QueryManagement", "createAdjustmentRequest");
    private final static QName _GetBalanceRequest_QNAME = new QName("http://www.izzi.mx/Schema/PKM_QueryManagement", "getBalanceRequest");
    private final static QName _ListPayments_QNAME = new QName("http://www.izzi.mx/Schema/PKM_QueryManagement", "listPayments");
    private final static QName _GetPaymentsReverseAdjustmentResponse_QNAME = new QName("http://www.izzi.mx/Schema/PKM_QueryManagement", "getPaymentsReverseAdjustmentResponse");
    private final static QName _ReasonAdjustment_QNAME = new QName("http://www.izzi.mx/Schema/PKM_QueryManagement", "reasonAdjustment");
    private final static QName _GetPaymentsReverseAdjustmentRequest_QNAME = new QName("http://www.izzi.mx/Schema/PKM_QueryManagement", "getPaymentsReverseAdjustmentRequest");
    private final static QName _GetBalanceResponse_QNAME = new QName("http://www.izzi.mx/Schema/PKM_QueryManagement", "getBalanceResponse");
    private final static QName _Adjustment_QNAME = new QName("http://www.izzi.mx/Schema/PKM_QueryManagement", "adjustment");
    private final static QName _EndDate_QNAME = new QName("http://www.izzi.mx/Schema/PKM_QueryManagement", "endDate");
    private final static QName _GetPaymentVsRechargeRequest_QNAME = new QName("http://www.izzi.mx/Schema/PKM_QueryManagement", "getPaymentVsRechargeRequest");
    private final static QName _GetPaymentVsRechargeResponse_QNAME = new QName("http://www.izzi.mx/Schema/PKM_QueryManagement", "getPaymentVsRechargeResponse");
    private final static QName _Code_QNAME = new QName("http://www.izzi.mx/Schema/PKM_QueryManagement", "code");
    private final static QName _Products_QNAME = new QName("http://www.izzi.mx/Schema/PKM_QueryManagement", "products");
    private final static QName _ProductName_QNAME = new QName("http://www.izzi.mx/Schema/PKM_QueryManagement", "productName");
    private final static QName _GetProductsResponse_QNAME = new QName("http://www.izzi.mx/Schema/PKM_QueryManagement", "getProductsResponse");
    private final static QName _Recharge_QNAME = new QName("http://www.izzi.mx/Schema/PKM_QueryManagement", "recharge");
    private final static QName _Balance_QNAME = new QName("http://www.izzi.mx/Schema/PKM_QueryManagement", "balance");
    private final static QName _ListRecharges_QNAME = new QName("http://www.izzi.mx/Schema/PKM_QueryManagement", "listRecharges");
    private final static QName _Payment_QNAME = new QName("http://www.izzi.mx/Schema/PKM_QueryManagement", "payment");
    private final static QName _ListAdjustments_QNAME = new QName("http://www.izzi.mx/Schema/PKM_QueryManagement", "listAdjustments");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.izzi.schema.pkm_querymanagement
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPaymentVsRechargeResponseType }
     * 
     */
    public GetPaymentVsRechargeResponseType createGetPaymentVsRechargeResponseType() {
        return new GetPaymentVsRechargeResponseType();
    }

    /**
     * Create an instance of {@link GetPaymentVsRechargeRequestType }
     * 
     */
    public GetPaymentVsRechargeRequestType createGetPaymentVsRechargeRequestType() {
        return new GetPaymentVsRechargeRequestType();
    }

    /**
     * Create an instance of {@link GetProductsResponseType }
     * 
     */
    public GetProductsResponseType createGetProductsResponseType() {
        return new GetProductsResponseType();
    }

    /**
     * Create an instance of {@link ProductsType }
     * 
     */
    public ProductsType createProductsType() {
        return new ProductsType();
    }

    /**
     * Create an instance of {@link BalanceType }
     * 
     */
    public BalanceType createBalanceType() {
        return new BalanceType();
    }

    /**
     * Create an instance of {@link RechargeType }
     * 
     */
    public RechargeType createRechargeType() {
        return new RechargeType();
    }

    /**
     * Create an instance of {@link ListRechargeType }
     * 
     */
    public ListRechargeType createListRechargeType() {
        return new ListRechargeType();
    }

    /**
     * Create an instance of {@link PaymentType }
     * 
     */
    public PaymentType createPaymentType() {
        return new PaymentType();
    }

    /**
     * Create an instance of {@link ListAdjustmentsType }
     * 
     */
    public ListAdjustmentsType createListAdjustmentsType() {
        return new ListAdjustmentsType();
    }

    /**
     * Create an instance of {@link GetProductsRequestType }
     * 
     */
    public GetProductsRequestType createGetProductsRequestType() {
        return new GetProductsRequestType();
    }

    /**
     * Create an instance of {@link CreateAdjustmentResponseType }
     * 
     */
    public CreateAdjustmentResponseType createCreateAdjustmentResponseType() {
        return new CreateAdjustmentResponseType();
    }

    /**
     * Create an instance of {@link ListProductsType }
     * 
     */
    public ListProductsType createListProductsType() {
        return new ListProductsType();
    }

    /**
     * Create an instance of {@link GetBalanceRequestType }
     * 
     */
    public GetBalanceRequestType createGetBalanceRequestType() {
        return new GetBalanceRequestType();
    }

    /**
     * Create an instance of {@link ListPaymentType }
     * 
     */
    public ListPaymentType createListPaymentType() {
        return new ListPaymentType();
    }

    /**
     * Create an instance of {@link CreateAdjustmentRequestType }
     * 
     */
    public CreateAdjustmentRequestType createCreateAdjustmentRequestType() {
        return new CreateAdjustmentRequestType();
    }

    /**
     * Create an instance of {@link GetPaymentReverseAdjustmentResponseType }
     * 
     */
    public GetPaymentReverseAdjustmentResponseType createGetPaymentReverseAdjustmentResponseType() {
        return new GetPaymentReverseAdjustmentResponseType();
    }

    /**
     * Create an instance of {@link GetBalanceResponseType }
     * 
     */
    public GetBalanceResponseType createGetBalanceResponseType() {
        return new GetBalanceResponseType();
    }

    /**
     * Create an instance of {@link AdjustmentType }
     * 
     */
    public AdjustmentType createAdjustmentType() {
        return new AdjustmentType();
    }

    /**
     * Create an instance of {@link GetPaymentReverseAdjustmentRequestType }
     * 
     */
    public GetPaymentReverseAdjustmentRequestType createGetPaymentReverseAdjustmentRequestType() {
        return new GetPaymentReverseAdjustmentRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListProductsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.izzi.mx/Schema/PKM_QueryManagement", name = "listProducts")
    public JAXBElement<ListProductsType> createListProducts(ListProductsType value) {
        return new JAXBElement<ListProductsType>(_ListProducts_QNAME, ListProductsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.izzi.mx/Schema/PKM_QueryManagement", name = "initDate")
    public JAXBElement<String> createInitDate(String value) {
        return new JAXBElement<String>(_InitDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.izzi.mx/Schema/PKM_QueryManagement", name = "getProductsRequest")
    public JAXBElement<GetProductsRequestType> createGetProductsRequest(GetProductsRequestType value) {
        return new JAXBElement<GetProductsRequestType>(_GetProductsRequest_QNAME, GetProductsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAdjustmentResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.izzi.mx/Schema/PKM_QueryManagement", name = "createAdjustmentResponse")
    public JAXBElement<CreateAdjustmentResponseType> createCreateAdjustmentResponse(CreateAdjustmentResponseType value) {
        return new JAXBElement<CreateAdjustmentResponseType>(_CreateAdjustmentResponse_QNAME, CreateAdjustmentResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.izzi.mx/Schema/PKM_QueryManagement", name = "amount")
    public JAXBElement<BigDecimal> createAmount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Amount_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.izzi.mx/Schema/PKM_QueryManagement", name = "accountNumber")
    public JAXBElement<String> createAccountNumber(String value) {
        return new JAXBElement<String>(_AccountNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.izzi.mx/Schema/PKM_QueryManagement", name = "message")
    public JAXBElement<String> createMessage(String value) {
        return new JAXBElement<String>(_Message_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAdjustmentRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.izzi.mx/Schema/PKM_QueryManagement", name = "createAdjustmentRequest")
    public JAXBElement<CreateAdjustmentRequestType> createCreateAdjustmentRequest(CreateAdjustmentRequestType value) {
        return new JAXBElement<CreateAdjustmentRequestType>(_CreateAdjustmentRequest_QNAME, CreateAdjustmentRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBalanceRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.izzi.mx/Schema/PKM_QueryManagement", name = "getBalanceRequest")
    public JAXBElement<GetBalanceRequestType> createGetBalanceRequest(GetBalanceRequestType value) {
        return new JAXBElement<GetBalanceRequestType>(_GetBalanceRequest_QNAME, GetBalanceRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPaymentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.izzi.mx/Schema/PKM_QueryManagement", name = "listPayments")
    public JAXBElement<ListPaymentType> createListPayments(ListPaymentType value) {
        return new JAXBElement<ListPaymentType>(_ListPayments_QNAME, ListPaymentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPaymentReverseAdjustmentResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.izzi.mx/Schema/PKM_QueryManagement", name = "getPaymentsReverseAdjustmentResponse")
    public JAXBElement<GetPaymentReverseAdjustmentResponseType> createGetPaymentsReverseAdjustmentResponse(GetPaymentReverseAdjustmentResponseType value) {
        return new JAXBElement<GetPaymentReverseAdjustmentResponseType>(_GetPaymentsReverseAdjustmentResponse_QNAME, GetPaymentReverseAdjustmentResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.izzi.mx/Schema/PKM_QueryManagement", name = "reasonAdjustment")
    public JAXBElement<String> createReasonAdjustment(String value) {
        return new JAXBElement<String>(_ReasonAdjustment_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPaymentReverseAdjustmentRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.izzi.mx/Schema/PKM_QueryManagement", name = "getPaymentsReverseAdjustmentRequest")
    public JAXBElement<GetPaymentReverseAdjustmentRequestType> createGetPaymentsReverseAdjustmentRequest(GetPaymentReverseAdjustmentRequestType value) {
        return new JAXBElement<GetPaymentReverseAdjustmentRequestType>(_GetPaymentsReverseAdjustmentRequest_QNAME, GetPaymentReverseAdjustmentRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBalanceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.izzi.mx/Schema/PKM_QueryManagement", name = "getBalanceResponse")
    public JAXBElement<GetBalanceResponseType> createGetBalanceResponse(GetBalanceResponseType value) {
        return new JAXBElement<GetBalanceResponseType>(_GetBalanceResponse_QNAME, GetBalanceResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdjustmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.izzi.mx/Schema/PKM_QueryManagement", name = "adjustment")
    public JAXBElement<AdjustmentType> createAdjustment(AdjustmentType value) {
        return new JAXBElement<AdjustmentType>(_Adjustment_QNAME, AdjustmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.izzi.mx/Schema/PKM_QueryManagement", name = "endDate")
    public JAXBElement<String> createEndDate(String value) {
        return new JAXBElement<String>(_EndDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPaymentVsRechargeRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.izzi.mx/Schema/PKM_QueryManagement", name = "getPaymentVsRechargeRequest")
    public JAXBElement<GetPaymentVsRechargeRequestType> createGetPaymentVsRechargeRequest(GetPaymentVsRechargeRequestType value) {
        return new JAXBElement<GetPaymentVsRechargeRequestType>(_GetPaymentVsRechargeRequest_QNAME, GetPaymentVsRechargeRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPaymentVsRechargeResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.izzi.mx/Schema/PKM_QueryManagement", name = "getPaymentVsRechargeResponse")
    public JAXBElement<GetPaymentVsRechargeResponseType> createGetPaymentVsRechargeResponse(GetPaymentVsRechargeResponseType value) {
        return new JAXBElement<GetPaymentVsRechargeResponseType>(_GetPaymentVsRechargeResponse_QNAME, GetPaymentVsRechargeResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.izzi.mx/Schema/PKM_QueryManagement", name = "code")
    public JAXBElement<Integer> createCode(Integer value) {
        return new JAXBElement<Integer>(_Code_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.izzi.mx/Schema/PKM_QueryManagement", name = "products")
    public JAXBElement<ProductsType> createProducts(ProductsType value) {
        return new JAXBElement<ProductsType>(_Products_QNAME, ProductsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.izzi.mx/Schema/PKM_QueryManagement", name = "productName")
    public JAXBElement<String> createProductName(String value) {
        return new JAXBElement<String>(_ProductName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.izzi.mx/Schema/PKM_QueryManagement", name = "getProductsResponse")
    public JAXBElement<GetProductsResponseType> createGetProductsResponse(GetProductsResponseType value) {
        return new JAXBElement<GetProductsResponseType>(_GetProductsResponse_QNAME, GetProductsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechargeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.izzi.mx/Schema/PKM_QueryManagement", name = "recharge")
    public JAXBElement<RechargeType> createRecharge(RechargeType value) {
        return new JAXBElement<RechargeType>(_Recharge_QNAME, RechargeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BalanceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.izzi.mx/Schema/PKM_QueryManagement", name = "balance")
    public JAXBElement<BalanceType> createBalance(BalanceType value) {
        return new JAXBElement<BalanceType>(_Balance_QNAME, BalanceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListRechargeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.izzi.mx/Schema/PKM_QueryManagement", name = "listRecharges")
    public JAXBElement<ListRechargeType> createListRecharges(ListRechargeType value) {
        return new JAXBElement<ListRechargeType>(_ListRecharges_QNAME, ListRechargeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.izzi.mx/Schema/PKM_QueryManagement", name = "payment")
    public JAXBElement<PaymentType> createPayment(PaymentType value) {
        return new JAXBElement<PaymentType>(_Payment_QNAME, PaymentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAdjustmentsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.izzi.mx/Schema/PKM_QueryManagement", name = "listAdjustments")
    public JAXBElement<ListAdjustmentsType> createListAdjustments(ListAdjustmentsType value) {
        return new JAXBElement<ListAdjustmentsType>(_ListAdjustments_QNAME, ListAdjustmentsType.class, null, value);
    }

}
