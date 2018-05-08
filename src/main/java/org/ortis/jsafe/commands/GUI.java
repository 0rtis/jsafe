/*******************************************************************************
 * Copyright 2018 Ortis (cao.ortis.org@gmail.com)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under the License.
 ******************************************************************************/

package org.ortis.jsafe.commands;

import java.util.concurrent.Callable;

import org.ortis.jsafe.gui.LoginFrame;

import picocli.CommandLine.Command;

/**
 * Start the GUI
 * 
 * @author Ortis <br>
 *         2018 May 08 8:35:11 PM <br>
 */
@Command(description = "Start the GUI", name = "gui", mixinStandardHelpOptions = true, version = Bootstrap.VERSION, showDefaultValues = true)
public class GUI implements Callable<Void>
{

	@Override
	public Void call() throws Exception
	{
		LoginFrame.main(new String[0]);
		return null;
	}

}