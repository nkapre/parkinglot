package com.kapresoft.parkingapp.services;

public class ParkingLotAppServicesFactory {
    private static final ParkingLotAppServicesFactory factory = new ParkingLotAppServicesFactory();

    private static final ParkingLotServiceInf parkingLotService = new ParkingLotService();
    private static final ParkingSlotServiceInf parkingSlotService = new ParkingSlotService();
    private static final ReservationServiceInf reservationService = new ReservationService();


    private ParkingLotAppServicesFactory() {

    }

    public static final ParkingLotAppServicesFactory getInstance() {
        return factory;
    }

    public ParkingLotServiceInf getParkingLotService() {
        return parkingLotService;
    }

    public ParkingSlotServiceInf getParkingSlotService() {
        return parkingSlotService;
    }

    public ReservationServiceInf getReservationService() {
        return reservationService;
    }
}