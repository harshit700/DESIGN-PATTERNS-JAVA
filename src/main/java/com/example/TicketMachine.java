package com.example;

public class TicketMachine {
    public Ticket createTicket(String ticketType) {
        if (ticketType.equalsIgnoreCase("Bus")) {
            return new BusTicket();
        }
        else {
            return new TrainTicket();
        }
    }
}
