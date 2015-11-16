// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class gib
{

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
    private final gfq k = new gfq((byte)0);
    private final gfq l = new gfq((byte)0);
    private boolean m;
    private float n[];
    private boolean o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private final gfq w = new gfq();
    private final float x[] = new float[8];
    private final gfq y = new gfq();
    private final float z[] = new float[8];

    public gib(String s1)
    {
        n = gnf.a();
        i = s1;
        g = ByteBuffer.allocateDirect(x.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        h = ByteBuffer.allocateDirect(z.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    private static void a(gfq gfq1, float af[])
    {
        af[0] = gfq1.a;
        af[1] = gfq1.c;
        af[2] = gfq1.d;
        af[3] = gfq1.c;
        af[4] = gfq1.d;
        af[5] = gfq1.b;
        af[6] = gfq1.a;
        af[7] = gfq1.b;
    }

    public void a()
    {
        GLES20.glDeleteProgram(p);
        GLES20.glDeleteProgram(q);
        p = 0;
        q = 0;
        r = 0;
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
            o = true;
        }
    }

    public void a(int i1, int j1, boolean flag)
    {
        if (i1 != e || j1 != f || flag != m)
        {
            e = i1;
            f = j1;
            m = flag;
            o = true;
        }
    }

    public void a(gfq gfq1)
    {
        boolean flag1 = false;
        boolean flag;
        if (gfq1.a >= 0.0F && gfq1.b >= 0.0F && gfq1.d >= 0.0F && gfq1.c >= 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gdv.a("Expected condition to be true", flag);
        if (gfq1.a <= 1.0F && gfq1.b <= 1.0F && gfq1.d <= 1.0F && gfq1.c <= 1.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gdv.a("Expected condition to be true", flag);
        if (gfq1.a + gfq1.d < 1.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gdv.a("Expected condition to be true", flag);
        flag = flag1;
        if (gfq1.b + gfq1.c < 1.0F)
        {
            flag = true;
        }
        gdv.a("Expected condition to be true", flag);
        if (!k.equals(gfq1))
        {
            k.a = gfq1.a;
            k.b = gfq1.b;
            k.d = gfq1.d;
            k.c = gfq1.c;
            o = true;
        }
    }

    public void a(float af[])
    {
        n = af;
    }

    public void b(gfq gfq1)
    {
        boolean flag1 = false;
        boolean flag;
        if (gfq1.a >= 0.0F && gfq1.b >= 0.0F && gfq1.d >= 0.0F && gfq1.c >= 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gdv.a("Expected condition to be true", flag);
        flag = flag1;
        if (gfq1.a <= 1.0F)
        {
            flag = flag1;
            if (gfq1.b <= 1.0F)
            {
                flag = flag1;
                if (gfq1.d <= 1.0F)
                {
                    flag = flag1;
                    if (gfq1.c <= 1.0F)
                    {
                        flag = true;
                    }
                }
            }
        }
        gdv.a("Expected condition to be true", flag);
        if (!l.equals(gfq1))
        {
            l.a = gfq1.a;
            l.b = gfq1.b;
            l.d = gfq1.d;
            l.c = gfq1.c;
            o = true;
        }
    }

    void d()
    {
        float f9 = 1.0F;
        if (!o)
        {
            return;
        }
        float f12 = 1.0F - k.a - k.d;
        float f11 = 1.0F - k.b - k.c;
        int i1 = (int)((float)b * f12);
        int j1 = (int)((float)c * f11);
        float f1 = (float)i1 / (float)j1;
        float f10 = (float)e / (float)f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        if (m)
        {
            if (f10 > f1)
            {
                f1 = Math.min((f10 - f1) / f10, 0.5F) / 2.0F;
                f2 = 0.0F;
                f3 = f1;
                f4 = 0.0F;
            } else
            {
                f4 = Math.min((f1 - f10) / f1, 0.5F) / 2.0F;
                f2 = f4;
                f3 = 0.0F;
                f1 = 0.0F;
            }
        } else
        {
            f1 = 0.0F;
            f2 = 0.0F;
            f3 = 0.0F;
            f4 = 0.0F;
        }
        f7 = f1;
        f8 = f2;
        f5 = f3;
        f6 = f4;
        if (l.d > 0.0F)
        {
            f7 = f1;
            f8 = f2;
            f5 = f3;
            f6 = f4;
            if (l.c > 0.0F)
            {
                f6 = l.a;
                f5 = l.b;
                f8 = l.d;
                f7 = l.c;
                f6 = Math.min(f4, f6 * f12);
                f5 = Math.min(f3, f5 * f11);
                f8 = Math.min(f2, f12 - f8 * f12);
                f7 = Math.min(f1, f11 - f7 * f11);
            }
        }
        f1 = k.a + f6;
        f2 = k.b;
        f3 = k.d + f8;
        f4 = k.c;
        if (d)
        {
            w.a = 1.0F - f1;
            w.d = f3;
        } else
        {
            w.a = f1;
            w.d = 1.0F - f3;
        }
        w.b = f2 + f5;
        w.c = 1.0F - (f4 + f7);
        a(w, x);
        g.put(x).position(0);
        f3 = i1;
        f1 = j1;
        f4 = i1;
        f2 = j1;
        f3 = (float)i1 - f3 * f6 - f8 * f4;
        f1 = (float)j1 - f5 * f1 - f7 * f2;
        if (f10 > f3 / f1)
        {
            f2 = (((float)f / f1) * f3) / (float)e;
            f1 = 1.0F;
        } else
        {
            f1 = (f1 * ((float)e / f3)) / (float)f;
            f2 = f9;
        }
        y.a = -f2;
        y.b = f1;
        y.d = f2;
        y.c = -f1;
        a(y, z);
        h.put(z).position(0);
        o = false;
    }

    public boolean e()
    {
        if (p == 0)
        {
            p = g.h("attribute vec4 vPosition;attribute vec2 a_texCoord;uniform mat4 a_xform;varying vec2 v_texCoord;void main() {  gl_Position = vPosition;  v_texCoord = vec2(a_xform * vec4(a_texCoord, 1.0, 1.0));}", "uniform sampler2D s_texture;precision mediump float;varying vec2 v_texCoord;void main() {  gl_FragColor = texture2D(s_texture, v_texCoord);}");
            g.C("failed to compile regular shaders");
            if (p == 0)
            {
                throw new IllegalStateException("Failed to compile regular shaders; no GL error");
            }
            q = g.h("attribute vec4 vPosition;attribute vec2 a_texCoord;uniform mat4 a_xform;varying vec2 v_texCoord;void main() {  gl_Position = vPosition;  v_texCoord = vec2(a_xform * vec4(a_texCoord, 1.0, 1.0));}", "#extension GL_OES_EGL_image_external : require\nuniform samplerExternalOES s_texture;precision mediump float;varying vec2 v_texCoord;void main() {  gl_FragColor = texture2D(s_texture, v_texCoord);}");
            g.C("failed to compile OES shaders");
            if (q == 0)
            {
                throw new IllegalStateException("Failed to compile OES shaders; no GL error");
            }
        }
        d();
        int i1;
        int j1;
        if (j)
        {
            i1 = q;
        } else
        {
            i1 = p;
        }
        if (i1 != r)
        {
            r = i1;
            t = GLES20.glGetAttribLocation(r, "a_texCoord");
            u = GLES20.glGetAttribLocation(r, "vPosition");
            s = GLES20.glGetUniformLocation(r, "s_texture");
            v = GLES20.glGetUniformLocation(r, "a_xform");
            g.C("get..Location");
        }
        GLES20.glUseProgram(r);
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
        GLES20.glUniformMatrix4fv(v, 1, false, n, 0);
        j1 = s;
        gdv.a(33984, 33984, 34015);
        GLES20.glUniform1i(j1, 0);
        GLES20.glTexParameteri(i1, 10241, 9729);
        GLES20.glTexParameteri(i1, 10240, 9729);
        GLES20.glTexParameteri(i1, 10242, 33071);
        GLES20.glTexParameteri(i1, 10243, 33071);
        GLES20.glVertexAttribPointer(t, 2, 5126, false, 0, g);
        GLES20.glEnableVertexAttribArray(t);
        GLES20.glVertexAttribPointer(u, 2, 5126, false, 0, h);
        GLES20.glEnableVertexAttribArray(u);
        GLES20.glDrawArrays(6, 0, 4);
        g.D("drawFrame");
        return true;
    }
}
