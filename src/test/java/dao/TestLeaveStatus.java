package dao;

import model.LeaveStatus;
import service.LeaveStatusService;

public class TestLeaveStatus {

	public static void main(String[] args) {
		

		LeaveStatusService ltService = new LeaveStatusService();
			
		LeaveStatus findById = ltService.findById(1L);
		System.out.println(findById);
	}
}
