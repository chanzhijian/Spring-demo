package com.csair.ndc.controller;

import com.csair.ndc.model.Acknowledgement.Acknowledgement;
import com.csair.ndc.model.AirDocDisplayRS.AirDocDisplayRS;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.csair.ndc.model.AirDocDisplayRQ.AirDocDisplayRQ;
import com.csair.ndc.model.AirDocHistoryRQ.AirDocHistoryRQ;
import com.csair.ndc.model.AirDocHistoryRS.AirDocHistoryRS;
import com.csair.ndc.model.AirDocIssueRQ.AirDocIssueRQ;
import com.csair.ndc.model.AirDocNotifRQ.AirDocNotifRQ;
import com.csair.ndc.model.AirShoppingRQ.AirShoppingRQ;
import com.csair.ndc.model.AirShoppingRS.AirShoppingRS;
import com.csair.ndc.model.AirlineProfileNotif.AirlineProfileNotif;
import com.csair.ndc.model.AirlineProfileRQ.AirlineProfileRQ;
import com.csair.ndc.model.AirlineProfileRS.AirlineProfileRS;
import com.csair.ndc.model.BaggageAllowanceRQ.BaggageAllowanceRQ;
import com.csair.ndc.model.BaggageAllowanceRS.BaggageAllowanceRS;
import com.csair.ndc.model.BaggageChargesRQ.BaggageChargesRQ;
import com.csair.ndc.model.BaggageChargesRS.BaggageChargesRS;
import com.csair.ndc.model.BaggageListRQ.BaggageListRQ;
import com.csair.ndc.model.BaggageListRS.BaggageListRS;
import com.csair.ndc.model.CustomerInputRQ.CustomerInputRQ;
import com.csair.ndc.model.CustomerInputRS.CustomerInputRS;
import com.csair.ndc.model.FareRulesRQ.FareRulesRQ;
import com.csair.ndc.model.FareRulesRS.FareRulesRS;
import com.csair.ndc.model.FileRetrieveRQ.FileRetrieveRQ;
import com.csair.ndc.model.FileRetrieveRS.FileRetrieveRS;
import com.csair.ndc.model.InvGuaranteeRQ.InvGuaranteeRQ;
import com.csair.ndc.model.InvGuaranteeRS.InvGuaranteeRS;
import com.csair.ndc.model.InvReleaseNotif.InvReleaseNotif;
import com.csair.ndc.model.OfferPriceRQ.OfferPriceRQ;
import com.csair.ndc.model.OfferPriceRS.OfferPriceRS;
import com.csair.ndc.model.OrderCancelRQ.OrderCancelRQ;
import com.csair.ndc.model.OrderCancelRS.OrderCancelRS;
import com.csair.ndc.model.OrderChangeNotif.OrderChangeNotif;
import com.csair.ndc.model.OrderChangeRQ.OrderChangeRQ;
import com.csair.ndc.model.OrderCreateRQ.OrderCreateRQ;
import com.csair.ndc.model.OrderHistoryRQ.OrderHistoryRQ;
import com.csair.ndc.model.OrderHistoryRS.OrderHistoryRS;
import com.csair.ndc.model.OrderListRQ.OrderListRQ;
import com.csair.ndc.model.OrderListRS.OrderListRS;
import com.csair.ndc.model.OrderReshopRQ.OrderReshopRQ;
import com.csair.ndc.model.OrderReshopRS.OrderReshopRS;
import com.csair.ndc.model.OrderRetrieveRQ.OrderRetrieveRQ;
import com.csair.ndc.model.OrderRulesRQ.OrderRulesRQ;
import com.csair.ndc.model.OrderRulesRS.OrderRulesRS;
import com.csair.ndc.model.OrderViewRS.OrderViewRS;
import com.csair.ndc.model.OrderViewRS.SuccessType;
import com.csair.ndc.model.SeatAvailabilityRQ.SeatAvailabilityRQ;
import com.csair.ndc.model.SeatAvailabilityRS.SeatAvailabilityRS;
import com.csair.ndc.model.ServiceListRQ.ServiceListRQ;
import com.csair.ndc.model.ServiceListRS.ServiceListRS;
import com.csair.ndc.util.JAXBUtil;

@RestController
public class RestInterfaceController {
	private static final Logger logger = LoggerFactory
			.getLogger(RestInterfaceController.class);

	@RequestMapping(value = "/airDocDisplay")
	public AirDocDisplayRS airDocDisplay( @RequestBody AirDocDisplayRQ airDocDisplayRQ) {
		// do something
		// .....
		return new AirDocDisplayRS();
	}
	
	@RequestMapping(value = "/airDocHistory")
	public AirDocHistoryRS airDocHistory( @RequestBody AirDocHistoryRQ airDocHistoryRQ) {
		// do something
		// .....
		return new AirDocHistoryRS();
	}
	
	@RequestMapping(value = "/airDocIssue")
	public OrderViewRS airDocIssue( @RequestBody AirDocIssueRQ airDocIssueRQ) {
		// do something
		// .....
		return new OrderViewRS();
	}

	@RequestMapping(value = "/airDocNotifRQ")
	public OrderViewRS airDocNotifRQ( @RequestBody AirDocNotifRQ airDocNotifRQ) {
		// do something
		// .....
		return new OrderViewRS();
	}
	
	@RequestMapping(value = "/airlineProfileNotif")
	public Acknowledgement airlineProfileNotif( @RequestBody AirlineProfileNotif airlineProfileNotif) {
		// do something
		// .....
		return null;
	}
	
	@RequestMapping(value = "/airlineProfile")
	public AirlineProfileRS airlineProfile( @RequestBody AirlineProfileRQ airlineProfileRQ) {
		// do something
		// .....
		return new AirlineProfileRS();
	}
	
	@RequestMapping(value = "/airShopping")
	public AirShoppingRS airShopping( @RequestBody AirShoppingRQ airShoppingRQ) {
		// do something
		// .....
		return new AirShoppingRS();
	}
	
	@RequestMapping(value = "/baggageAllowance")
	public BaggageAllowanceRS baggageAllowance( @RequestBody BaggageAllowanceRQ baggageAllowanceRQ) {
		// do something
		// .....
		return new BaggageAllowanceRS();
	}
	
	@RequestMapping(value = "/baggageCharges")
	public BaggageChargesRS baggageCharges( @RequestBody BaggageChargesRQ baggageChargesRQ) {
		// do something
		// .....
		return new BaggageChargesRS();
	}
	
	@RequestMapping(value = "/baggageList")
	public BaggageListRS BaggageList( @RequestBody BaggageListRQ baggageListRQ) {
		// do something
		// .....
		return new BaggageListRS();
	}
	
	@RequestMapping(value = "/customerInput")
	public CustomerInputRS customerInput( @RequestBody CustomerInputRQ customerInputRQ) {
		// do something
		// .....
		return new CustomerInputRS();
	}
	
	@RequestMapping(value = "/fareRules")
	public FareRulesRS fareRules( @RequestBody FareRulesRQ fareRulesRQ) {
		// do something
		// .....
		return new FareRulesRS();
	}
	
	@RequestMapping(value = "/fileRetrieve")
	public FileRetrieveRS fileRetrieve( @RequestBody FileRetrieveRQ fileRetrieveRQ) {
		// do something
		// .....
		return new FileRetrieveRS();
	}
	
	@RequestMapping(value = "/invGuarantee")
	public InvGuaranteeRS invGuarantee( @RequestBody InvGuaranteeRQ invGuaranteeRQ) {
		// do something
		// .....
		return new InvGuaranteeRS();
	}
	
	@RequestMapping(value = "/invReleaseNotif")
	public Acknowledgement invReleaseNotif( @RequestBody InvReleaseNotif invReleaseNotif) {
		// do something
		// .....
		return new Acknowledgement();
	}
	
	@RequestMapping(value = "/offerPrice")
	public OfferPriceRS offerPrice( @RequestBody OfferPriceRQ offerPriceRQ) {
		// do something
		// .....
		return new OfferPriceRS();
	}
	
	@RequestMapping(value = "/orderCancel")
	public OrderCancelRS orderCancel( @RequestBody OrderCancelRQ orderCancelRQ) {
		// do something
		// .....
		return new OrderCancelRS();
	}
	
	@RequestMapping(value = "/orderChangeNotif")
	public Acknowledgement orderChangeNotif( @RequestBody OrderChangeNotif orderChangeNotif) {
		// do something
		// .....
		return new Acknowledgement();
	}
	
	@RequestMapping(value = "/orderchange", method = RequestMethod.POST)
	public OrderViewRS orderchange(@RequestBody OrderChangeRQ orderChangeRQ) {
		logger.info("look req : {} ", JAXBUtil.toXML(orderChangeRQ));
		// do something
		// .....
		OrderViewRS orderViewRS = new OrderViewRS();
		orderViewRS.setSuccess(new SuccessType());
		return orderViewRS;
	}
	
	@RequestMapping(value = "/orderCreate")
	public OrderViewRS orderCreate( @RequestBody OrderCreateRQ orderCreateRQ) {
		// do something
		// .....
		return new OrderViewRS();
	}
	
	@RequestMapping(value = "/orderHistory")
	public OrderHistoryRS orderHistory( @RequestBody OrderHistoryRQ orderHistoryRQ) {
		// do something
		// .....
		return new OrderHistoryRS();
	}
	
	@RequestMapping(value = "/orderList")
	public OrderListRS orderList( @RequestBody OrderListRQ orderListRQ) {
		// do something
		// .....
		return new OrderListRS();
	}
	
	@RequestMapping(value = "/orderReshop")
	public OrderReshopRS orderReshop( @RequestBody OrderReshopRQ orderReshopRQ) {
		// do something
		// .....
		return new OrderReshopRS();
	}
	
	@RequestMapping(value = "/orderRetrieve")
	public OrderViewRS orderRetrieve( @RequestBody OrderRetrieveRQ orderRetrieveRQ) {
		// do something
		// .....
		return new OrderViewRS();
	}
	
	@RequestMapping(value = "/orderRules")
	public OrderRulesRS orderRules( @RequestBody OrderRulesRQ orderRulesRQ) {
		// do something
		// .....
		return new OrderRulesRS();
	}
	
	@RequestMapping(value = "/seatAvailability")
	public SeatAvailabilityRS seatAvailability( @RequestBody SeatAvailabilityRQ seatAvailabilityRQ) {
		// do something
		// .....
		return new SeatAvailabilityRS();
	}
	
	@RequestMapping(value = "/serviceList")
	public ServiceListRS serviceList( @RequestBody ServiceListRQ serviceListRQ) {
		// do something
		// .....
		return new ServiceListRS();
	}
	


}
