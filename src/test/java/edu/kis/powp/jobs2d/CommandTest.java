package edu.kis.powp.jobs2d;

import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

/**
 * Plotter test.
 * 
 * @author Dominik
 */
public class CommandTest {
	private static Job2dDriver driver = new StubDriver();

	/**
	 * Driver test.
	 */
	public static void main(String[] args) {
		DriverCommand operateToCommand = new OperateToCommand(2, 2);

		operateToCommand.execute(driver);

		DriverCommand setPositionCommand = new SetPositionCommand(0,0);
		setPositionCommand.execute(driver);
	}

	private static class StubDriver implements Job2dDriver {

		@Override
		public void operateTo(int x, int y) {
			System.out.println("Driver operateTo action...");
		}

		@Override
		public void setPosition(int x, int y) {
			System.out.println("Driver setPosition action...");
		}
	};
}
