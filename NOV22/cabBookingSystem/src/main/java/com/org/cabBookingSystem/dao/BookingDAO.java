package com.org.cabBookingSystem.dao;

import com.org.cabBookingSystem.models.Booking;

public interface BookingDAO {
	// insert into booking ( e_id, src, destn, date, time, m_id) values ();
	void insertBooking(Booking b);

// update booking set approve = true where b_id = 123;
	void updateApprove(boolean approve, int bId);

// update booking set cnumber = 1223 where b_id = 123
	void updateCabNumber(int cNumber, int bId);

// select  * from booking where b_id = 123;
	 Booking findBooking(int bId);

}
