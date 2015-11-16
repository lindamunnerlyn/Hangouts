// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class gfc
{

    private final gdc A = new gdc();
    private final float B[] = new float[8];
    public int a;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public final FloatBuffer g;
    public final FloatBuffer h;
    private final String i;
    private boolean j;
    private float k;
    private float l;
    private float m;
    private float n;
    private boolean o;
    private float p[];
    private boolean q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private final gdc y = new gdc();
    private final float z[] = new float[8];

    public gfc(String s1)
    {
        p = gkd.a();
        i = s1;
        g = ByteBuffer.allocateDirect(z.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        h = ByteBuffer.allocateDirect(B.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    private static void a(gdc gdc1, float af[])
    {
        af[0] = gdc1.a;
        af[1] = gdc1.c;
        af[2] = gdc1.d;
        af[3] = gdc1.c;
        af[4] = gdc1.d;
        af[5] = gdc1.b;
        af[6] = gdc1.a;
        af[7] = gdc1.b;
    }

    public void a()
    {
        GLES20.glDeleteProgram(r);
        GLES20.glDeleteProgram(s);
        r = 0;
        s = 0;
        t = 0;
    }

    public void a(float f1, float f2, float f3, float f4)
    {
        boolean flag1 = false;
        boolean flag;
        if (f1 >= 0.0F && f2 >= 0.0F && f3 >= 0.0F && f4 >= 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gbh.a(flag);
        flag = flag1;
        if (f1 <= 1.0F)
        {
            flag = flag1;
            if (f2 <= 1.0F)
            {
                flag = flag1;
                if (f3 <= 1.0F)
                {
                    flag = flag1;
                    if (f4 <= 1.0F)
                    {
                        flag = true;
                    }
                }
            }
        }
        gbh.a(flag);
        if (k != f1 || l != f2 || m != f3 || n != f4)
        {
            k = f1;
            l = f2;
            m = f3;
            n = f4;
            q = true;
        }
    }

    public void a(int i1, int j1, int k1, boolean flag, boolean flag1)
    {
        if (i1 != a || j1 != b || k1 != c || flag != d || flag1 != j)
        {
            a = i1;
            b = j1;
            c = k1;
            d = flag;
            j = flag1;
            q = true;
        }
    }

    public void a(int i1, int j1, boolean flag)
    {
        if (i1 != e || j1 != f || flag != o)
        {
            e = i1;
            f = j1;
            o = flag;
            q = true;
        }
    }

    public void a(float af[])
    {
        p = af;
    }

    void d()
    {
        float f2 = 0.0F;
        float f3 = 1.0F;
        if (!q)
        {
            return;
        }
        int i1 = (int)((float)b * (1.0F - k - m));
        int j1 = (int)((float)c * (1.0F - l - n));
        float f1 = (float)i1 / (float)j1;
        float f4 = (float)e / (float)f;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        if (o)
        {
            if (f4 > f1)
            {
                f1 = Math.min((f4 - f1) / f4, 0.5F) / 2.0F;
            } else
            {
                f2 = Math.min((f1 - f4) / f1, 0.5F) / 2.0F;
                f1 = 0.0F;
            }
        } else
        {
            f1 = 0.0F;
        }
        f5 = k + ((float)i1 * f2) / (float)b;
        f6 = l;
        f7 = ((float)j1 * f1) / (float)c;
        f8 = m + ((float)i1 * f2) / (float)b;
        f9 = n;
        f10 = ((float)j1 * f1) / (float)c;
        if (d)
        {
            y.a = 1.0F - f5;
            y.d = f8;
        } else
        {
            y.a = f5;
            y.d = 1.0F - f8;
        }
        y.b = f6 + f7;
        y.c = 1.0F - (f9 + f10);
        a(y, z);
        g.put(z).position(0);
        f6 = i1;
        f5 = j1;
        f2 = (float)i1 - f2 * f6 * 2.0F;
        f1 = (float)j1 - f1 * f5 * 2.0F;
        if (f4 > f2 / f1)
        {
            f2 = (((float)f / f1) * f2) / (float)e;
            f1 = 1.0F;
        } else
        {
            f1 = (f1 * ((float)e / f2)) / (float)f;
            f2 = f3;
        }
        A.a = -f2;
        A.b = f1;
        A.d = f2;
        A.c = -f1;
        a(A, B);
        h.put(B).position(0);
        q = false;
    }

    public boolean e()
    {
        if (r == 0)
        {
            r = g.h("attribute vec4 vPosition;attribute vec2 a_texCoord;uniform mat4 a_xform;varying vec2 v_texCoord;void main() {  gl_Position = vPosition;  v_texCoord = vec2(a_xform * vec4(a_texCoord, 1.0, 1.0));}", "uniform sampler2D s_texture;precision mediump float;varying vec2 v_texCoord;void main() {  gl_FragColor = texture2D(s_texture, v_texCoord);}");
            g.z("failed to compile regular shaders");
            if (r == 0)
            {
                throw new IllegalStateException("Failed to compile regular shaders; no GL error");
            }
            s = g.h("attribute vec4 vPosition;attribute vec2 a_texCoord;uniform mat4 a_xform;varying vec2 v_texCoord;void main() {  gl_Position = vPosition;  v_texCoord = vec2(a_xform * vec4(a_texCoord, 1.0, 1.0));}", "#extension GL_OES_EGL_image_external : require\nuniform samplerExternalOES s_texture;precision mediump float;varying vec2 v_texCoord;void main() {  gl_FragColor = texture2D(s_texture, v_texCoord);}");
            g.z("failed to compile OES shaders");
            if (s == 0)
            {
                throw new IllegalStateException("Failed to compile OES shaders; no GL error");
            }
        }
        d();
        int i1;
        int j1;
        if (j)
        {
            i1 = s;
        } else
        {
            i1 = r;
        }
        if (i1 != t)
        {
            t = i1;
            v = GLES20.glGetAttribLocation(t, "a_texCoord");
            w = GLES20.glGetAttribLocation(t, "vPosition");
            u = GLES20.glGetUniformLocation(t, "s_texture");
            x = GLES20.glGetUniformLocation(t, "a_xform");
            g.z("get..Location");
        }
        GLES20.glUseProgram(t);
        GLES20.glViewport(0, 0, e, f);
        GLES20.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
        GLES20.glClear(16384);
        GLES20.glDisable(3042);
        GLES20.glDisable(2929);
        GLES20.glActiveTexture(33984);
        i1 = 3553;
        if (j)
        {
            i1 = 36197;
        }
        GLES20.glBindTexture(i1, a);
        GLES20.glUniformMatrix4fv(x, 1, false, p, 0);
        j1 = u;
        gbh.a(33984, 33984, 34015);
        GLES20.glUniform1i(j1, 0);
        GLES20.glTexParameteri(i1, 10241, 9729);
        GLES20.glTexParameteri(i1, 10240, 9729);
        GLES20.glTexParameteri(i1, 10242, 33071);
        GLES20.glTexParameteri(i1, 10243, 33071);
        GLES20.glVertexAttribPointer(v, 2, 5126, false, 0, g);
        GLES20.glEnableVertexAttribArray(v);
        GLES20.glVertexAttribPointer(w, 2, 5126, false, 0, h);
        GLES20.glEnableVertexAttribArray(w);
        GLES20.glDrawArrays(6, 0, 4);
        g.A("drawFrame");
        return true;
    }
}
