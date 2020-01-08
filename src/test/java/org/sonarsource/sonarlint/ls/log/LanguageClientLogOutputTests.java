/*
 * SonarLint Language Server
 * Copyright (C) 2009-2020 SonarSource SA
 * mailto:info AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonarsource.sonarlint.ls.log;

import org.eclipse.lsp4j.MessageType;
import org.junit.jupiter.api.Test;
import org.sonarsource.sonarlint.core.client.api.common.LogOutput.Level;

import static org.assertj.core.api.Assertions.assertThat;

class LanguageClientLogOutputTests {

  @Test
  public void coverage() {
    assertThat(LanguageClientLogOutput.messageType(Level.ERROR)).isEqualTo(MessageType.Error);
    assertThat(LanguageClientLogOutput.messageType(Level.WARN)).isEqualTo(MessageType.Warning);
    assertThat(LanguageClientLogOutput.messageType(Level.INFO)).isEqualTo(MessageType.Info);
    assertThat(LanguageClientLogOutput.messageType(Level.DEBUG)).isEqualTo(MessageType.Log);
    assertThat(LanguageClientLogOutput.messageType(Level.TRACE)).isEqualTo(MessageType.Log);
  }
}
