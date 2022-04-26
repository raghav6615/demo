private String dateTimeStringToZonedDateTimeString(String bookingConfirmDate) {
        if (!ObjectUtils.isEmpty(bookingConfirmDate)) {
            DateTimeFormatter dateFormatter
                    = DateTimeFormatter.ofPattern(BookingConstants.BOOKING_DATE_FORMAT);
            LocalDateTime zoneLocalDate = LocalDateTime.parse(bookingConfirmDate, dateFormatter);
            if (!ObjectUtils.isEmpty(zoneLocalDate)){
                ZonedDateTime zonedBookingConfirmDate = zoneLocalDate.atZone(ZoneId.systemDefault());
                return zonedBookingConfirmDate.toOffsetDateTime().toString();
            }
        }
        return null;
    }
