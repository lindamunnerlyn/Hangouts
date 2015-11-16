// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

public final class eab
    implements android.os.Handler.Callback, dnb, Runnable
{

    private static eac L;
    private static Handler M;
    private static final byte U[] = new byte[768];
    private static final Object ab = new Object();
    private static final byte d[] = "NETSCAPE2.0".getBytes();
    private int A[];
    private int B;
    private Bitmap C;
    private final dzl D;
    private long E;
    private boolean F;
    private int G;
    private int H;
    private boolean I;
    private boolean J;
    private final Handler K;
    private boolean N;
    private boolean O;
    private boolean P;
    private final byte Q[];
    private int R;
    private int S;
    private int T[];
    private boolean V;
    private int W;
    private int X;
    private boolean Y;
    private eae Z;
    public int a;
    private a aa;
    public final int b[];
    public int c;
    private volatile boolean e;
    private volatile boolean f;
    private int g;
    private boolean h;
    private int i;
    private int j[];
    private int k[];
    private boolean l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private final byte r[];
    private int s;
    private boolean t;
    private int u;
    private final short v[];
    private final byte w[];
    private final byte x[];
    private byte y[];
    private boolean z;

    public eab(byte abyte0[], eae eae1, dzl dzl1)
    {
        int j1;
        j1 = 0;
        super();
        r = new byte[256];
        s = 2;
        v = new short[4096];
        w = new byte[4096];
        x = new byte[4097];
        J = true;
        K = new Handler(Looper.getMainLooper(), this);
        b = new int[256];
        D = dzl1;
        Y = true;
        synchronized (ab)
        {
            if (L == null)
            {
                eac eac1 = new eac();
                L = eac1;
                eac1.start();
                M = new Handler(L.getLooper(), L);
            }
        }
        Z = eae1;
        Q = abyte0;
        abyte0 = new ead(this, abyte0);
        int i1;
        if (abyte0.read() == 71)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0) goto _L2; else goto _L1
_L1:
        if (abyte0.read() != 73) goto _L2; else goto _L3
_L3:
        i1 = 1;
_L12:
        if (i1 == 0) goto _L5; else goto _L4
_L4:
        if (abyte0.read() != 70) goto _L5; else goto _L6
_L6:
        i1 = 1;
_L13:
        if (i1 != 0) goto _L8; else goto _L7
_L7:
        e = true;
        ebw.f("Babel", "Not a valid Gif.");
_L17:
        a = abyte0.a();
        X = a;
        i1 = R;
        q = i1;
        o = i1;
        p = S;
        boolean flag = false;
        i1 = j1;
        j1 = ((flag) ? 1 : 0);
_L11:
        if (i1 != 0) goto _L10; else goto _L9
_L9:
        C = D.b(R, S);
        N = false;
        int k1 = R * S;
        T = new int[k1];
        y = new byte[k1];
        M.sendMessage(M.obtainMessage(10, this));
        i1 = 1;
          goto _L11
        abyte0;
        dzl1;
        JVM INSTR monitorexit ;
        throw abyte0;
_L2:
        i1 = 0;
          goto _L12
_L5:
        i1 = 0;
          goto _L13
_L8:
        abyte0.skip(3L);
        R = a(abyte0);
        S = a(abyte0);
        if (R > 0 && S > 0) goto _L15; else goto _L14
_L14:
        e = true;
        ebw.f("Babel", "Not a valid Gif. Width or height is 0");
_L19:
        if (!V) goto _L17; else goto _L16
_L16:
        boolean flag1 = e;
        if (flag1) goto _L17; else goto _L18
_L18:
        a(abyte0, b, W);
        g = b[c];
          goto _L17
        eae1;
        e = true;
        ebw.d("Babel", "Not a valid Gif.", eae1);
          goto _L17
        eae1;
        e = true;
        ebw.d("Babel", "Could not read input stream from the gif.", eae1);
_L10:
        try
        {
            abyte0.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return;
        }
          goto _L12
_L15:
        i1 = abyte0.read();
        if ((i1 & 0x80) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        V = flag1;
        W = 2 << (i1 & 7);
        c = abyte0.read();
        abyte0.skip(1L);
          goto _L19
        eae1;
        e = true;
        ebw.d("Babel", "Gif has invalid arguments", eae1);
          goto _L10
        eae1;
        ebw.f("Babel", "Out of memory trying to create bitmap to use for Gif.");
        j1++;
        if (j1 > 1)
        {
            break MISSING_BLOCK_LABEL_613;
        }
        gbi.a.a();
          goto _L11
        e = true;
        ebw.f("Babel", "Out of Memory. Failed to create bitmap to use for Gif. Aborting");
        i1 = 1;
          goto _L11
    }

    private static int a(InputStream inputstream)
    {
        return inputstream.read() | inputstream.read() << 8;
    }

    private static int a(byte abyte0[], int ai[], int i1, int j1)
    {
        boolean flag = false;
        int k1 = j1;
        for (j1 = ((flag) ? 1 : 0); j1 < i1; j1++)
        {
            int i2 = k1 + 1;
            byte byte0 = abyte0[k1];
            int l1 = i2 + 1;
            i2 = abyte0[i2];
            k1 = l1 + 1;
            ai[j1] = (i2 & 0xff) << 8 | ((byte0 & 0xff) << 16 | 0xff000000) | abyte0[l1] & 0xff;
        }

        return k1;
    }

    static Bitmap a(eab eab1)
    {
        return eab1.C;
    }

    private void a(Runnable runnable)
    {
        K.removeCallbacks(runnable);
        F = false;
    }

    private static boolean a(InputStream inputstream, int ai[], int i1)
    {
        byte abyte0[] = U;
        abyte0;
        JVM INSTR monitorenter ;
        int j1 = i1 * 3;
        if (inputstream.read(U, 0, j1) >= j1)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        abyte0;
        JVM INSTR monitorexit ;
        return false;
        a(U, ai, i1, 0);
        abyte0;
        JVM INSTR monitorexit ;
        return true;
        inputstream;
        abyte0;
        JVM INSTR monitorexit ;
        throw inputstream;
    }

    public static boolean a(byte abyte0[])
    {
        return abyte0.length >= 3 && abyte0[0] == 71 && abyte0[1] == 73 && abyte0[2] == 70;
    }

    static boolean b(eab eab1)
    {
        return eab1.N;
    }

    static void c(eab eab1)
    {
        eab1.s;
        JVM INSTR tableswitch 0 3: default 36
    //                   0 203
    //                   1 203
    //                   2 239
    //                   3 211;
           goto _L1 _L2 _L2 _L3 _L4
_L1:
        eab1.s = 0;
        eab1.t = false;
        eab1.P = false;
        eab1.H = 100;
        eab1.j = null;
_L5:
        byte abyte0[];
        int i1;
        abyte0 = eab1.Q;
        i1 = eab1.X;
        eab1.X = i1 + 1;
        abyte0[i1] & 0xff;
        JVM INSTR lookupswitch 4: default 128
    //                   0: 62
    //                   33: 131
    //                   44: 546
    //                   59: 2039;
           goto _L5 _L5 _L6 _L7 _L8
_L6:
        abyte0 = eab1.Q;
        i1 = eab1.X;
        eab1.X = i1 + 1;
        abyte0[i1] & 0xff;
        JVM INSTR lookupswitch 4: default 196
    //                   1: 539
    //                   249: 333
    //                   254: 532
    //                   255: 466;
           goto _L9 _L10 _L11 _L12 _L13
_L9:
        eab1.l();
          goto _L5
_L2:
        eab1.z = false;
          goto _L1
_L4:
        if (eab1.z)
        {
            System.arraycopy(eab1.A, 0, eab1.T, 0, eab1.A.length);
        }
          goto _L1
_L3:
        eab1.z = false;
        int j1 = 0;
        if (!eab1.t)
        {
            j1 = eab1.g;
        }
        int l1 = 0;
        while (l1 < eab1.p) 
        {
            int j2 = (eab1.n + l1) * eab1.R + eab1.m;
            int l2 = eab1.o;
            for (i1 = j2; i1 < l2 + j2; i1++)
            {
                eab1.T[i1] = j1;
            }

            l1++;
        }
          goto _L1
_L11:
        eab1.X = eab1.X + 1;
        byte abyte1[] = eab1.Q;
        i1 = eab1.X;
        eab1.X = i1 + 1;
        i1 = abyte1[i1] & 0xff;
        eab1.s = (i1 & 0x1c) >> 2;
        boolean flag;
        if ((i1 & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        eab1.t = flag;
        eab1.H = eab1.k() * 10;
        if (eab1.H <= 10)
        {
            eab1.H = 100;
        }
        abyte1 = eab1.Q;
        i1 = eab1.X;
        eab1.X = i1 + 1;
        eab1.u = abyte1[i1] & 0xff;
        eab1.X = eab1.X + 1;
          goto _L5
_L13:
        eab1.j();
        i1 = 0;
_L18:
        if (i1 >= d.length) goto _L15; else goto _L14
_L14:
        if (eab1.r[i1] == d[i1]) goto _L17; else goto _L16
_L16:
        i1 = 0;
_L63:
        if (i1 != 0)
        {
            while (eab1.j() > 0 && !eab1.e) ;
        } else
        {
            eab1.l();
        }
          goto _L5
_L17:
        i1++;
          goto _L18
_L12:
        eab1.l();
          goto _L5
_L10:
        eab1.l();
          goto _L5
_L7:
        int k1;
        int i2;
        int k2;
        int j3;
        int k4;
        int j7;
        int k7;
        int l7;
        eab1.m = eab1.k();
        eab1.n = eab1.k();
        i1 = eab1.k();
        k1 = eab1.k();
        eab1.o = Math.min(i1, eab1.R - eab1.m);
        eab1.p = Math.min(k1, eab1.S - eab1.n);
        eab1.q = i1;
        i1 *= k1;
        if (i1 > eab1.y.length)
        {
            eab1.y = new byte[i1];
        }
        byte abyte2[] = eab1.Q;
        i1 = eab1.X;
        eab1.X = i1 + 1;
        i1 = abyte2[i1] & 0xff;
        boolean flag1;
        if ((i1 & 0x40) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        eab1.l = flag1;
        if ((i1 & 0x80) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        eab1.h = flag1;
        eab1.i = (int)Math.pow(2D, (i1 & 7) + 1);
        if (eab1.h)
        {
            if (eab1.j == null)
            {
                eab1.j = new int[256];
            }
            eab1.X = a(eab1.Q, eab1.j, eab1.i, eab1.X);
            eab1.k = eab1.j;
        } else
        {
            eab1.k = eab1.b;
            if (eab1.c == eab1.u)
            {
                eab1.g = 0;
            }
        }
        k4 = 0;
        if (eab1.t)
        {
            k4 = eab1.k[eab1.u];
            eab1.k[eab1.u] = 0;
        }
        if (eab1.k == null)
        {
            eab1.e = true;
            ebw.f("Babel", "Could not read color table from the gif. Abort.");
        }
        if (eab1.e) goto _L20; else goto _L19
_L19:
        int k3;
        int l3;
        int i4;
        int j4;
        j7 = eab1.o * eab1.p;
        abyte2 = eab1.Q;
        i1 = eab1.X;
        eab1.X = i1 + 1;
        k7 = abyte2[i1] & 0xff;
        l7 = 1 << k7;
        k1 = l7 + 2;
        i2 = -1;
        k2 = k7 + 1;
        j3 = (1 << k2) - 1;
        for (i1 = 0; i1 < l7; i1++)
        {
            eab1.v[i1] = 0;
            eab1.w[i1] = (byte)i1;
        }

        k3 = 0;
        l3 = 0;
        i4 = 0;
        j4 = 0;
        i1 = 0;
_L25:
        int i3 = i1;
        if (i1 >= j7) goto _L22; else goto _L21
_L21:
        int l4;
        byte abyte3[] = eab1.Q;
        i3 = eab1.X;
        eab1.X = i3 + 1;
        l4 = abyte3[i3] & 0xff;
        i3 = i1;
        if (l4 == 0) goto _L22; else goto _L23
_L23:
        int i5;
        int k5;
        int i6;
        int j6;
        int k6;
        int l6;
        int i7;
        int i8;
        i8 = eab1.X + l4;
        k6 = k1;
        j6 = i2;
        i6 = k2;
        k5 = j3;
        i7 = k3;
        l6 = l3;
        i5 = i4;
        l4 = j4;
        i3 = i1;
_L27:
        i1 = i3;
        j4 = l4;
        i4 = i5;
        l3 = l6;
        k3 = i7;
        j3 = k5;
        k2 = i6;
        i2 = j6;
        k1 = k6;
        if (eab1.X >= i8) goto _L25; else goto _L24
_L24:
        byte abyte4[] = eab1.Q;
        i1 = eab1.X;
        eab1.X = i1 + 1;
        i2 = i7 + ((abyte4[i1] & 0xff) << l6);
        k1 = l6 + 8;
        l3 = k6;
        i1 = j6;
        k3 = i6;
        j3 = k5;
        j4 = i5;
        i4 = l4;
        k2 = i3;
_L30:
        i3 = k2;
        l4 = i4;
        i5 = j4;
        l6 = k1;
        i7 = i2;
        k5 = j3;
        i6 = k3;
        j6 = i1;
        k6 = l3;
        if (k1 < k3) goto _L27; else goto _L26
_L26:
        i3 = i2 & j3;
        i2 >>= k3;
        k1 -= k3;
        if (i3 != l7) goto _L29; else goto _L28
_L28:
        k3 = k7 + 1;
        j3 = (1 << k3) - 1;
        l3 = l7 + 2;
        i1 = -1;
          goto _L30
_L29:
        if (i3 != l7 + 1) goto _L32; else goto _L31
_L31:
        eab1.X = i8;
_L51:
        eab1.l();
        if (eab1.e) goto _L20; else goto _L33
_L33:
        if (eab1.s == 3 && !eab1.z)
        {
            if (eab1.A == null)
            {
                eab1.A = null;
                byte abyte5[];
                byte abyte6[];
                int j5;
                int l5;
                try
                {
                    eab1.A = new int[eab1.T.length];
                }
                catch (OutOfMemoryError outofmemoryerror)
                {
                    Log.e("Babel", "Gif backupFrame threw an OOME", outofmemoryerror);
                }
            }
            if (eab1.A != null)
            {
                System.arraycopy(eab1.T, 0, eab1.A, 0, eab1.T.length);
                eab1.z = true;
            }
        }
        i3 = 1;
        k2 = 8;
        j3 = 0;
        i2 = 0;
_L60:
        if (i2 >= eab1.p) goto _L35; else goto _L34
_L34:
        if (!eab1.l) goto _L37; else goto _L36
_L36:
        i1 = j3;
        k1 = k2;
        k3 = i3;
        if (j3 < eab1.p) goto _L39; else goto _L38
_L38:
        k3 = i3 + 1;
        k3;
        JVM INSTR tableswitch 2 4: default 1444
    //                   2 1972
    //                   3 1981
    //                   4 1989;
           goto _L40 _L41 _L42 _L43
_L40:
        k1 = k2;
        i1 = j3;
_L39:
        j3 = i1 + k1;
        i3 = k3;
          goto _L44
_L32:
        if (i1 != -1) goto _L46; else goto _L45
_L45:
        eab1.y[k2] = eab1.w[i3];
        k2++;
        i1 = i3;
        j4 = i3;
          goto _L30
_L46:
        if (i3 < l3) goto _L48; else goto _L47
_L47:
        abyte5 = eab1.x;
        l4 = i4 + 1;
        abyte5[i4] = (byte)j4;
        if (l4 != 4097) goto _L50; else goto _L49
_L49:
        eab1.e = true;
        ebw.f("Babel", "Error while decoding Gif.");
          goto _L51
_L57:
        i4 = l4;
_L62:
        if (j4 < l7) goto _L53; else goto _L52
_L52:
        if (j4 < 4097 && j4 != eab1.v[j4]) goto _L55; else goto _L54
_L54:
        eab1.e = true;
        ebw.f("Babel", "Error while decoding Gif.");
          goto _L51
_L55:
        abyte5 = eab1.x;
        l4 = i4 + 1;
        abyte5[i4] = eab1.w[j4];
        j4 = eab1.v[j4];
        if (l4 != 4097) goto _L57; else goto _L56
_L56:
        eab1.e = true;
        ebw.f("Babel", "Error while decoding Gif.");
          goto _L51
_L53:
        j4 = eab1.w[j4];
        eab1.x[i4] = (byte)j4;
        l5 = j3;
        j5 = k3;
        l4 = l3;
        if (l3 < 4096)
        {
            eab1.v[l3] = (short)i1;
            eab1.w[l3] = (byte)j4;
            i1 = l3 + 1;
            l5 = j3;
            j5 = k3;
            l4 = i1;
            if ((i1 & j3) == 0)
            {
                l5 = j3;
                j5 = k3;
                l4 = i1;
                if (i1 < 4096)
                {
                    j5 = k3 + 1;
                    l5 = j3 + i1;
                    l4 = i1;
                }
            }
        }
        j3 = i4 + 1;
_L61:
        abyte5 = eab1.y;
        i1 = k2 + 1;
        abyte6 = eab1.x;
        j3--;
        abyte5[k2] = abyte6[j3];
        if (j3 > 0) goto _L59; else goto _L58
_L58:
        k2 = i1;
        i1 = i3;
        i4 = j3;
        j3 = l5;
        k3 = j5;
        l3 = l4;
          goto _L30
_L22:
        while (i3 < j7) 
        {
            eab1.y[i3] = 0;
            i3++;
        }
          goto _L51
_L41:
        i1 = 4;
        k1 = k2;
          goto _L39
_L42:
        i1 = 2;
        k1 = 4;
          goto _L39
_L43:
        i1 = 1;
        k1 = 2;
          goto _L39
_L44:
        i1 += eab1.n;
        if (i1 < eab1.S)
        {
            k2 = eab1.R;
            k3 = eab1.m + i1 * k2;
            l3 = eab1.o;
            i1 = eab1.q * i2;
            for (k2 = k3; k2 < k3 + l3;)
            {
                i4 = eab1.y[i1];
                i4 = eab1.k[i4 & 0xff];
                if (i4 != 0)
                {
                    eab1.T[k2] = i4;
                }
                k2++;
                i1++;
            }

        }
        i2++;
        k2 = k1;
          goto _L60
_L35:
        if (eab1.t)
        {
            eab1.k[eab1.u] = k4;
        }
        eab1.B = eab1.B + 1;
_L20:
        return;
_L8:
        eab1.P = true;
        return;
_L37:
        i1 = i2;
        k1 = k2;
          goto _L44
_L59:
        k2 = i1;
          goto _L61
_L50:
        j4 = i1;
        i4 = l4;
          goto _L62
_L48:
        j4 = i3;
          goto _L62
_L15:
        i1 = 1;
          goto _L63
    }

    static boolean d(eab eab1)
    {
        eab1.P = true;
        return true;
    }

    static boolean e(eab eab1)
    {
        return eab1.P;
    }

    static int f(eab eab1)
    {
        return eab1.B;
    }

    static boolean g(eab eab1)
    {
        eab1.e = true;
        return true;
    }

    static boolean h(eab eab1)
    {
        return eab1.Y;
    }

    static void i(eab eab1)
    {
        eab1.X = eab1.a;
        eab1.z = false;
        eab1.B = 0;
        eab1.s = 0;
    }

    private int j()
    {
        byte abyte0[] = Q;
        int i1 = X;
        X = i1 + 1;
        i1 = abyte0[i1] & 0xff;
        if (i1 > 0)
        {
            System.arraycopy(Q, X, r, 0, i1);
            X = X + i1;
        }
        return i1;
    }

    static boolean j(eab eab1)
    {
        eab1.f = true;
        return true;
    }

    private int k()
    {
        byte abyte0[] = Q;
        int i1 = X;
        X = i1 + 1;
        i1 = abyte0[i1];
        abyte0 = Q;
        int j1 = X;
        X = j1 + 1;
        return i1 & 0xff | (abyte0[j1] & 0xff) << 8;
    }

    static boolean k(eab eab1)
    {
        return eab1.e;
    }

    private void l()
    {
        int i1;
        do
        {
            byte abyte0[] = Q;
            i1 = X;
            X = i1 + 1;
            i1 = abyte0[i1] & 0xff;
            X = X + i1;
        } while (i1 > 0);
    }

    static boolean l(eab eab1)
    {
        return eab1.f;
    }

    static int m(eab eab1)
    {
        return eab1.H;
    }

    static Handler n(eab eab1)
    {
        return eab1.K;
    }

    public void a()
    {
    }

    public void a(eae eae1)
    {
        Z = eae1;
        if (eae1 != null && O)
        {
            Z.a(C);
        }
    }

    public void a(boolean flag)
    {
        if (J == flag)
        {
            return;
        }
        J = flag;
        if (J)
        {
            g();
            return;
        } else
        {
            h();
            return;
        }
    }

    public void b()
    {
    }

    public byte[] c()
    {
        return Q;
    }

    public int d()
    {
        return R;
    }

    public int e()
    {
        return S;
    }

    public boolean f()
    {
        return e;
    }

    public void g()
    {
        if (!F)
        {
            F = true;
            E = SystemClock.uptimeMillis();
            run();
        }
    }

    public void h()
    {
        if (F)
        {
            a(this);
        }
    }

    public boolean handleMessage(Message message)
    {
        boolean flag2 = false;
        boolean flag1 = false;
        if (message.what == 11)
        {
            G = message.arg1;
            if (C != null)
            {
                C.setPixels(T, 0, R, 0, 0, R, S);
                O = true;
                I = false;
                if (Z != null)
                {
                    boolean flag = flag1;
                    if (!e)
                    {
                        flag = flag1;
                        if (O)
                        {
                            flag = flag1;
                            if (!N)
                            {
                                flag = flag1;
                                if (o > 0)
                                {
                                    flag = flag1;
                                    if (p > 0)
                                    {
                                        flag = true;
                                    }
                                }
                            }
                        }
                    }
                    if (flag)
                    {
                        Z.a(C);
                        if (F)
                        {
                            if (!I)
                            {
                                E = Math.max(E + (long)G, SystemClock.uptimeMillis() + 5L);
                                long l1 = E;
                                if (J)
                                {
                                    K.postAtTime(this, l1);
                                    I = true;
                                }
                            }
                        } else
                        {
                            a(this);
                        }
                    }
                }
            }
            if (aa != null && f)
            {
                flag2 = e;
            }
            flag2 = true;
        }
        return flag2;
    }

    public void i()
    {
        if (C != null)
        {
            D.a(C);
            C = null;
        }
        N = true;
    }

    public void run()
    {
        while (N || f) 
        {
            return;
        }
        M.sendMessage(M.obtainMessage(10, this));
    }

}
