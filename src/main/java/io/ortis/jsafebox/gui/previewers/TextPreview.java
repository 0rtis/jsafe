/*
 *  Copyright 2019 Ortis (ortis@ortis.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package io.ortis.jsafebox.gui.previewers;

import javax.swing.*;
import java.awt.*;

public class TextPreview extends JPanel
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextArea editArea;

	public TextPreview(final String text)
	{

		super(new BorderLayout());

		editArea = new JTextArea();
		editArea.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
		editArea.setEditable(false);
		editArea.setText(text);
		editArea.setCaretPosition(0);

		JScrollPane scrollingText = new JScrollPane(editArea);

		add(scrollingText, BorderLayout.CENTER);

	}
}
