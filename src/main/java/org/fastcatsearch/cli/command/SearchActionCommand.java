package org.fastcatsearch.cli.command;

import java.io.IOException;

import org.fastcatsearch.cli.Command;
import org.fastcatsearch.cli.CommandException;
import org.fastcatsearch.cli.CommandResult;
import org.fastcatsearch.cli.ConsoleSessionContext;

public class SearchActionCommand extends Command {

	@Override
	public boolean isCommand(String[] cmd) {
		return isCommand(CMD_SEARCH, cmd);
	}

	@Override
	public CommandResult doCommand(String[] cmd, ConsoleSessionContext context)
			throws IOException, CommandException {
		// TODO Auto-generated method stub
		return null;
	}

}