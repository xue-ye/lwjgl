/*
 * Copyright (c) 2002-2004 LWJGL Project
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 * * Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the distribution.
 *
 * * Neither the name of 'LWJGL' nor the names of
 *   its contributors may be used to endorse or promote products derived
 *   from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 * TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

import org.lwjgl.generator.*;

public interface NV_fragment_program extends NV_program {
	/*
	 * Accepted by the <cap> parameter of Disable, Enable, and IsEnabled, by the
	 * <pname> parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev,
	 * and by the <target> parameter of BindProgramNV, LoadProgramNV,
	 * ProgramLocalParameter4dARB, ProgramLocalParameter4dvARB,
	 * ProgramLocalParameter4fARB, ProgramLocalParameter4fvARB,
	 * GetProgramLocalParameterdvARB, and GetProgramLocalParameterfvARB:
	 */
	int GL_FRAGMENT_PROGRAM_NV = 0x8870;

	/*
	 * Accepted by the <pname> parameter of GetBooleanv, GetIntegerv, GetFloatv,
	 * and GetDoublev:
	 */
	int GL_MAX_TEXTURE_COORDS_NV = 0x8871;
	int GL_MAX_TEXTURE_IMAGE_UNITS_NV = 0x8872;
	int GL_FRAGMENT_PROGRAM_BINDING_NV = 0x8873;
	int GL_MAX_FRAGMENT_PROGRAM_LOCAL_PARAMETERS_NV = 0x8868;

	void glProgramNamedParameter4fNV(@GLuint int id, @AutoSize("name") @GLsizei int length, @Const @GLubyte ByteBuffer name, float x, float y, float z, float w);

	@StripPostfix("params")
	void glGetProgramNamedParameterfvNV(@GLuint int id, @AutoSize("name") @GLsizei int length, @Const @GLubyte ByteBuffer name, @Check("4") FloatBuffer params);
}
