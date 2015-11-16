// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentUris;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;

public final class hea extends gzf
    implements hhj, hhk
{

    private static boolean A;
    private static boolean B;
    private static int C;
    private static int D;
    private static int E;
    private static int F;
    private static int G;
    private static int H;
    private static int I;
    private static final hed k;
    private static final hed l;
    private static final hed m;
    private static final hed n;
    private static final hed o;
    private static final hed p;
    private static final hed q;
    private static final hed r;
    private static final hed s;
    private static final hed t;
    private static final hed u;
    private static final hed v;
    private static final hed w;
    private static final hed x[];
    private static final hed y[];
    private static final hed z[];
    private String J;
    private File K;
    private File L;
    private hed M;
    private hed N;
    private String O;
    private ConnectivityManager P;
    private heb Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;

    public hea(gzl gzl1, hec hec1)
    {
        super(gzl1, hec1);
        R = -1;
        S = -1;
        T = 0;
        U = 0;
        V = -1;
        W = -1;
        if (!A)
        {
            int i1 = gzl1.d();
            D = i1;
            E = (int)((float)i1 * 0.5F);
            F = (int)((float)D * 0.3F);
            float f1 = gzl1.j();
            if ((double)f1 < 0.75D)
            {
                B = true;
                C = (int)(f1 * 8192F);
            }
            G = gzl1.e();
            H = gzl1.f();
            gzl1 = g.K(gzl1.l());
            I = Math.min(((DisplayMetrics) (gzl1)).widthPixels, ((DisplayMetrics) (gzl1)).heightPixels) / 4;
            A = true;
        }
        if (hec1.f != -1)
        {
            Q = (heb)hlp.a(a.l(), heb);
            R = Q.b();
            S = Q.c();
        }
    }

    private void D()
    {
        hed ahed[];
        int i1;
        i1 = ((hec)c).d();
        ahed = null;
        i1;
        JVM INSTR tableswitch 6 8: default 44
    //                   6 140
    //                   7 147
    //                   8 154;
           goto _L1 _L2 _L3 _L4
_L1:
        String s1;
        s1 = b();
        i1 = 0;
_L5:
        if (i1 < ahed.length)
        {
            Object obj = String.valueOf(s1);
            Object obj1 = String.valueOf(((hed) (ahed[i1])).c);
            if (((String) (obj1)).length() != 0)
            {
                obj = ((String) (obj)).concat(((String) (obj1)));
            } else
            {
                obj = new String(((String) (obj)));
            }
            obj1 = a.b().a(((String) (obj)));
            if (obj1 == null)
            {
                obj = a.c().a(((String) (obj)));
            } else
            {
                obj = obj1;
            }
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_173;
            }
            M = ahed[i1];
            L = ((File) (obj));
        }
        return;
_L2:
        ahed = x;
          goto _L1
_L3:
        ahed = y;
          goto _L1
_L4:
        ahed = z;
          goto _L1
        i1++;
          goto _L5
    }

    private boolean E()
    {
        if (P == null)
        {
            P = (ConnectivityManager)a.l().getSystemService("connectivity");
        }
        ConnectivityManager connectivitymanager = P;
        NetworkInfo networkinfo = connectivitymanager.getNetworkInfo(1);
        if (networkinfo == null || !networkinfo.isConnected())
        {
            return false;
        }
        return !fu.a(connectivitymanager);
    }

    private hed F()
    {
        switch (((hec)c).d())
        {
        default:
            return w;

        case 6: // '\006'
            return u;

        case 7: // '\007'
            return v;
        }
    }

    private boolean G()
    {
        Object obj = ((hec)c).d.c();
        if (hpj.a(((Uri) (obj))))
        {
            K = new File(((Uri) (obj)).getPath());
        } else
        {
            obj = hpj.a(a.l().getContentResolver(), ((Uri) (obj)));
            if (obj == null)
            {
                obj = String.valueOf(c);
                a((new StringBuilder(String.valueOf(obj).length() + 32)).append("Couldn't compute raw file name: ").append(((String) (obj))).toString(), ((Throwable) (null)));
                return false;
            }
            K = new File(((String) (obj)));
        }
        return true;
    }

    private Bitmap a(Context context, Uri uri, int i1)
    {
        Object obj = context.getContentResolver();
        Object obj1 = g.a(((android.content.ContentResolver) (obj)), uri);
        int j1 = Math.max(((Point) (obj1)).x / i1, ((Point) (obj1)).y / i1);
        Bitmap bitmap = null;
        if (j1 == 1)
        {
            bitmap = a.a(((Point) (obj1)).x, ((Point) (obj1)).y);
        }
        obj = g.a(((android.content.ContentResolver) (obj)), uri, j1, bitmap);
        if (obj != bitmap)
        {
            a.a(bitmap);
        }
        j1 = ((Bitmap) (obj)).getWidth();
        int k1 = ((Bitmap) (obj)).getHeight();
        float f1 = (float)i1 / (float)Math.max(j1, k1);
        if (f1 < 1.0F)
        {
            Bitmap bitmap2 = a.a(Math.round((float)j1 * f1), Math.round((float)k1 * f1));
            Bitmap bitmap1;
            if (f1 >= 1.0F)
            {
                bitmap1 = ((Bitmap) (obj));
            } else
            {
                if (bitmap2 == null)
                {
                    bitmap1 = Bitmap.createBitmap(Math.round((float)((Bitmap) (obj)).getWidth() * f1), Math.round((float)((Bitmap) (obj)).getHeight() * f1), android.graphics.Bitmap.Config.ARGB_8888);
                } else
                {
                    bitmap1 = bitmap2;
                }
                obj1 = new Matrix();
                ((Matrix) (obj1)).setScale(f1, f1);
                (new Canvas(bitmap1)).drawBitmap(((Bitmap) (obj)), ((Matrix) (obj1)), new Paint(3));
            }
            obj1 = bitmap1;
            if (bitmap1 != bitmap2)
            {
                a.a(bitmap2);
                obj1 = bitmap1;
            }
        } else
        {
            obj1 = obj;
        }
        if (obj1 != obj)
        {
            a.a(((Bitmap) (obj)));
        }
        context = a(context, uri, ((Bitmap) (obj1)));
        if (context != obj1)
        {
            a.a(((Bitmap) (obj1)));
        }
        return context;
    }

    private Bitmap a(Context context, Uri uri, Bitmap bitmap)
    {
        int i1 = g.b(context.getContentResolver(), uri);
        context = bitmap;
        if (i1 != 0)
        {
            uri = a.a(bitmap.getWidth(), bitmap.getHeight());
            Matrix matrix = new Matrix();
            matrix.setRotate(i1);
            RectF rectf = new RectF(0.0F, 0.0F, bitmap.getWidth(), bitmap.getHeight());
            matrix.mapRect(rectf);
            i1 = Math.round(rectf.width());
            int j1 = Math.round(rectf.height());
            context = a.a(i1, j1);
            matrix.postTranslate(-rectf.left, -rectf.top);
            (new Canvas(context)).drawBitmap(bitmap, matrix, new Paint(3));
            if (context != uri)
            {
                a.a(uri);
            }
        }
        return context;
    }

    private static String a(hdy hdy1, int i1, int j1, int k1, int l1, int i2)
    {
        StringBuilder stringbuilder = hpq.a();
        a(stringbuilder, hdy1.b()).append(File.separatorChar).append(j1).append(',').append(k1).append(',').append(l1).append(',').append(i2).append(',');
        a(stringbuilder, i1);
        stringbuilder.append(',');
        return hpq.a(stringbuilder);
    }

    private static StringBuilder a(StringBuilder stringbuilder, String s1)
    {
        stringbuilder.append(g.E(g.F(s1))).append('+');
        return stringbuilder;
    }

    private void a(Bitmap bitmap, String s1)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 85, bytearrayoutputstream);
        a.b().a(s1, bytearrayoutputstream.toByteArray());
        bytearrayoutputstream.close();
        return;
        bitmap;
        bytearrayoutputstream.close();
        throw bitmap;
    }

    private static void a(StringBuilder stringbuilder, int i1)
    {
        if ((i1 & 4) != 0)
        {
            stringbuilder.append("-a");
        }
        if ((i1 & 0x20) != 0)
        {
            stringbuilder.append("-nw");
        }
        if ((i1 & 0x100) != 0)
        {
            stringbuilder.append("-p");
        }
        if ((0x20000 & i1) != 0)
        {
            stringbuilder.append("-ip");
        }
    }

    private static boolean a(int i1, int j1, int k1)
    {
        if (i1 != 0 && j1 != 0)
        {
            i1 -= k1;
            j1 -= k1;
            if (i1 > 0)
            {
                while (j1 < 0 || j1 > i1) 
                {
                    return true;
                }
            } else
            if (j1 < 0 && j1 < i1)
            {
                return true;
            }
        }
        return false;
    }

    private static boolean a(hec hec1)
    {
        return hec1.e == 0 && hec1.f != -1 && hec1.j == null && hec1.i == null && hec1.d.g() && (hec1.d.e() == hee.a || hec1.d.e() == hee.d);
    }

    static int u()
    {
        return E;
    }

    static int v()
    {
        return F;
    }

    public Uri a(Uri uri)
    {
        hdu hdu1 = (hdu)hlp.a(a.l(), hdu);
        uri.getPath();
        uri = hee.a;
        return hdu1.c();
    }

    public String a()
    {
        Object obj;
        Object obj1;
        hec hec2;
        int i1;
        int l1;
        hec2 = (hec)c;
        hdy hdy1 = hec2.d;
        obj = hdy1.b();
        obj1 = obj;
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj = (hdu)hlp.b(a.l(), hdu);
            hdy1.c();
            if (obj != null)
            {
                obj = ((hdu) (obj)).a();
            } else
            {
                obj = null;
            }
            obj1 = obj;
            if (obj == null)
            {
                if (A())
                {
                    obj = String.valueOf(c);
                    (new StringBuilder(String.valueOf(obj).length() + 33)).append("Cannot retrieve content URI for: ").append(((String) (obj)));
                }
                return null;
            }
        }
        obj = g.F(((String) (obj1)));
        obj1 = (hec)c;
        i1 = 6;
        l1 = ((hec) (obj1)).b;
        if ((l1 & 4) != 0) goto _L2; else goto _L1
_L1:
        i1 = 22;
_L11:
        int j1 = i1;
        if ((l1 & 0x20) == 0)
        {
            j1 = i1 | 0x20;
        }
        i1 = j1;
        if ((l1 & 0x4000) != 0)
        {
            i1 = j1 | 0x80;
        }
        if (((hec) (obj1)).i != null)
        {
            i1 |= 0x400;
        }
        if ((0x20000 & l1) != 0)
        {
            i1 |= 0x200;
        }
        switch (hec2.e)
        {
        case 4: // '\004'
        default:
            return ((String) (obj));

        case 0: // '\0'
            int k1 = i1;
            if (hec2.g != 0)
            {
                k1 = i1;
                if (hec2.h != 0)
                {
                    if ((hec2.b & 0x100) == 0)
                    {
                        k1 = i1 | 0x48;
                    } else
                    {
                        k1 = i1;
                        if ((hec2.b & 0x200) == 512)
                        {
                            k1 = i1 | 0x40;
                        }
                    }
                }
            }
            hec hec1;
            if (hec2.f != -1)
            {
                i1 = Q.a();
            } else
            {
                i1 = k1;
            }
            return heh.a(((String) (obj)), i1, hec2.g, hec2.h, R, S, hec2.i);

        case 2: // '\002'
            k1 = i1;
            if ((hec2.b & 0x100) == 0)
            {
                k1 = i1 | 8;
            }
            return heh.a(((String) (obj)), k1, G, hec2.i);

        case 3: // '\003'
            return heh.a(((String) (obj)), i1, H, hec2.i);

        case 1: // '\001'
            return heh.a(((String) (obj)), i1, hec2.i);

        case 5: // '\005'
            hec1 = (hec)c;
            l1 = Math.max(hec1.g, hec1.h);
            k1 = l1;
            if (l1 == 0)
            {
                k1 = D;
            }
            l1 = k1;
            break;
        }
          goto _L3
_L2:
        if ((l1 & 0x20) == 0)
        {
            i1 = 16390;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if ((hec1.b & 0x400) != 0) goto _L5; else goto _L4
_L4:
        if (N == null)
        {
            N = F();
        }
        l1 = k1;
        N.b;
        JVM INSTR tableswitch 1 2: default 560
    //                   1 564
    //                   2 577;
           goto _L6 _L7 _L8
_L7:
        break; /* Loop/switch isn't completed */
_L6:
        l1 = k1;
_L5:
        return heh.a(((String) (obj)), i1, l1, hec2.i);
_L8:
        l1 = k1;
        if (B)
        {
            l1 = (C * k1) / 8192;
        }
        if (true) goto _L5; else goto _L9
_L9:
        if (true) goto _L11; else goto _L10
_L10:
    }

    public void a(Object obj)
    {
        hec hec1 = (hec)c;
        hec1.e;
        JVM INSTR lookupswitch 2: default 40
    //                   0: 69
    //                   5: 46;
           goto _L1 _L2 _L3
_L1:
        super.a(obj);
        return;
_L3:
        if (N != null)
        {
            M = N;
            N = null;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        T = hec1.g;
        U = hec1.h;
        V = R;
        W = S;
        if (true) goto _L1; else goto _L4
_L4:
    }

    public String b()
    {
        if (J != null) goto _L2; else goto _L1
_L1:
        Object obj1 = (hec)c;
        if (!a(((hec) (obj1)))) goto _L4; else goto _L3
_L3:
        J = a(((hec) (obj1)).d, ((hec) (obj1)).b, ((hec) (obj1)).g, ((hec) (obj1)).h, R, S);
_L2:
        return J;
_L4:
        int k1;
        int l1;
        Object obj = ((hec) (obj1)).d;
        int i1 = ((hec) (obj1)).b;
        int j1 = ((hec) (obj1)).e;
        k1 = ((hec) (obj1)).g;
        l1 = ((hec) (obj1)).h;
        RectF rectf = ((hec) (obj1)).i;
        if (((hec) (obj1)).j == null)
        {
            obj1 = null;
        } else
        {
            obj1 = ((hec) (obj1)).j.q();
        }
        if (((hdy) (obj)).g())
        {
            if (((hdy) (obj)).e() == hee.b)
            {
                obj = hel.a(((hdy) (obj)).b());
            } else
            {
                obj = ((hdy) (obj)).b();
            }
        } else
        if (((hdy) (obj)).h())
        {
            String s1 = String.valueOf(((hdy) (obj)).c());
            obj = String.valueOf(((hdy) (obj)).d());
            obj = (new StringBuilder(String.valueOf(s1).length() + 0 + String.valueOf(obj).length())).append(s1).append(((String) (obj))).toString();
        } else
        if (((hdy) (obj)).i())
        {
            obj = Long.toString(((hdy) (obj)).a());
        } else
        {
            obj = String.valueOf(obj);
            throw new IllegalStateException((new StringBuilder(String.valueOf(obj).length() + 31)).append("A media ref should have a URI: ").append(((String) (obj))).toString());
        }
        if (obj1 != null)
        {
            obj = String.valueOf(obj);
            obj1 = String.valueOf(obj1);
            if (((String) (obj1)).length() != 0)
            {
                obj = ((String) (obj)).concat(((String) (obj1)));
            } else
            {
                obj = new String(((String) (obj)));
            }
        }
        obj1 = hpq.a();
        ((StringBuilder) (obj1)).append(g.E(((String) (obj))));
        j1;
        JVM INSTR tableswitch 0 4: default 204
    //                   0 393
    //                   1 204
    //                   2 418
    //                   3 429
    //                   4 440;
           goto _L5 _L6 _L5 _L7 _L8 _L9
_L9:
        break MISSING_BLOCK_LABEL_440;
_L5:
        break; /* Loop/switch isn't completed */
_L6:
        break; /* Loop/switch isn't completed */
_L11:
        a(((StringBuilder) (obj1)), i1);
        if (rectf != null)
        {
            ((StringBuilder) (obj1)).append(heh.a(rectf));
        }
        J = hpq.a(((StringBuilder) (obj1)));
        if (true) goto _L2; else goto _L10
_L10:
        ((StringBuilder) (obj1)).append('-').append(k1).append('x').append(l1);
          goto _L11
_L7:
        ((StringBuilder) (obj1)).append("-t");
          goto _L11
_L8:
        ((StringBuilder) (obj1)).append("-l");
          goto _L11
        ((StringBuilder) (obj1)).append("-z");
          goto _L11
    }

    public void b(int i1)
    {
        boolean flag = false;
        i1;
        JVM INSTR tableswitch 0 3: default 32
    //                   0 103
    //                   1 143
    //                   2 138
    //                   3 143;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        i1 = ((flag) ? 1 : 0);
_L6:
        if (A())
        {
            String s1 = String.valueOf(c);
            (new StringBuilder(String.valueOf(s1).length() + 66)).append("Delivering resource type to consumers: ").append(s1).append(" resource type: ").append(i1);
        }
        if (i1 != 0)
        {
            a.b(this, i1);
        }
        return;
_L2:
        if (hpj.a(O))
        {
            i1 = 2;
        } else
        if (hpj.b(O))
        {
            i1 = 1;
        } else
        {
            i1 = -1;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        i1 = 4;
        continue; /* Loop/switch isn't completed */
_L3:
        i1 = 3;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void c()
    {
        hec hec1 = (hec)c;
        hdy hdy1 = hec1.d;
        if ((hec1.b & 2) != 0 && hdy1.h())
        {
            if (G())
            {
                if (A())
                {
                    String s1 = String.valueOf(c);
                    String s2 = String.valueOf(h());
                    (new StringBuilder(String.valueOf(s1).length() + 46 + String.valueOf(s2).length())).append("Returning file name to consumers: ").append(s1).append(" file name: ").append(s2);
                }
                a.a(this, 1, h());
                return;
            } else
            {
                a.a(this, 5, null);
                return;
            }
        } else
        {
            super.c();
            return;
        }
    }

    public void c(Object obj)
    {
        boolean flag;
        flag = true;
        super.c(obj);
        if (B() == 0) goto _L2; else goto _L1
_L1:
        hec hec1 = (hec)c;
        hec1.e;
        JVM INSTR lookupswitch 2: default 56
    //                   0: 153
    //                   5: 57;
           goto _L2 _L3 _L4
_L2:
        return;
_L4:
        if (M == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = M.d;
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((hed) (obj)).b == 2)
        {
            N = ((hed) (obj));
        } else
        if (((hed) (obj)).b == 3 && B && (hec1.b & 0x1000) == 0 && E())
        {
            N = ((hed) (obj));
        }
        if (N == null)
        {
            break; /* Loop/switch isn't completed */
        }
_L6:
        if (flag)
        {
            j();
            return;
        }
        if (true) goto _L2; else goto _L5
_L5:
        flag = false;
          goto _L6
_L3:
        if (!E()) goto _L2; else goto _L7
_L7:
        if (hec1.d.h() || !a(hec1) || hec1.f == -1 || (hec1.b & 0x1000) != 0) goto _L9; else goto _L8
_L8:
        if (V != 0) goto _L11; else goto _L10
_L10:
        if (W <= S) goto _L13; else goto _L12
_L12:
        int i1 = 1;
_L15:
        if (i1 != 0)
        {
            j();
            return;
        }
          goto _L2
_L11:
        if (W >= S) goto _L13; else goto _L14
_L14:
        i1 = 1;
          goto _L15
_L13:
        int k1 = b(obj);
        i1 = p();
        double d = (double)k1 / (double)i1;
        int j1;
        if (hec1.g == 0)
        {
            i1 = (int)((double)hec1.h * d);
        } else
        {
            i1 = hec1.g;
        }
        if (T == 0)
        {
            j1 = (int)(d * (double)U);
        } else
        {
            j1 = T;
        }
        if (i1 - I <= j1) goto _L9; else goto _L16
_L16:
        if (j1 > k1)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
          goto _L15
_L9:
        i1 = 0;
          goto _L15
    }

    public String f()
    {
        if (N != null)
        {
            String s1 = String.valueOf(b());
            String s2 = String.valueOf(N.c);
            if (s2.length() != 0)
            {
                return s1.concat(s2);
            } else
            {
                return new String(s1);
            }
        } else
        {
            return b();
        }
    }

    public File h()
    {
        if (K != null)
        {
            return K;
        } else
        {
            return super.h();
        }
    }

    public File i()
    {
        hec hec1;
        if (K != null)
        {
            return K;
        }
        hec1 = (hec)c;
        if ((hec1.b & 0x400) != 0)
        {
            return a.c().a(b());
        }
        hec1.e;
        JVM INSTR lookupswitch 2: default 80
    //                   0: 85
    //                   5: 1159;
           goto _L1 _L2 _L3
_L1:
        return super.i();
_L2:
        if (!a(hec1)) goto _L1; else goto _L4
_L4:
        hec hec2;
        File file;
        hec2 = (hec)c;
        gyr gyr1 = a.b();
        L = null;
        T = 0;
        U = 0;
        V = -1;
        W = -1;
        StringBuilder stringbuilder = hpq.a();
        a(stringbuilder, hec2.d.b());
        file = new File(gyr1.b(hpq.a(stringbuilder)));
        if (!file.exists()) goto _L6; else goto _L5
_L5:
        double d;
        String s5;
        File afile[];
        int j1;
        Object obj;
        String s1;
        if (hec2.g == 0 || hec2.h == 0)
        {
            d = -1D;
        } else
        {
            d = (double)hec2.g / (double)hec2.h;
        }
        j1 = hec2.b & 0xffffffdf;
        obj = hpq.a();
        a(((StringBuilder) (obj)), j1);
        s5 = hpq.a(((StringBuilder) (obj)));
        afile = file.listFiles();
        if (afile != null && afile.length != 0) goto _L7; else goto _L6
_L7:
        i1 = 0;
        obj1 = null;
_L12:
        if (i1 >= afile.length) goto _L9; else goto _L8
_L8:
        s4 = afile[i1].getName();
        as = s4.split(",");
        if (as.length >= 4) goto _L11; else goto _L10
_L10:
        (new File(file, s4)).delete();
        obj2 = obj1;
_L14:
        i1++;
        obj1 = obj2;
          goto _L12
_L11:
        obj2 = obj1;
        if (as.length >= 6)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (j1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        String s3;
        int j2;
        if (as.length >= 5)
        {
            s3 = as[4];
        } else
        {
            s3 = "";
        }
        obj2 = obj1;
        if (!s5.equals(s3)) goto _L14; else goto _L13
_L13:
        double d1;
        int k1;
        int i2;
        try
        {
            k1 = Integer.parseInt(as[0]);
            i2 = Integer.parseInt(as[1]);
            j2 = Integer.parseInt(as[2]);
            k2 = Integer.parseInt(as[3]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            Log.e("ImageResource", "NumberFormatException parsing cached file's filename.");
            obj2 = obj1;
            break; /* Loop/switch isn't completed */
        }
        if (k1 == 0 || i2 == 0)
        {
            d1 = -1D;
        } else
        {
            d1 = (double)k1 / (double)i2;
        }
        obj2 = obj1;
        if (d1 < d - 0.10000000000000001D)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj2 = obj1;
        if (d1 > d + 0.10000000000000001D)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj2 = obj1;
        if (j2 != R)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (obj1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (j2 != 0) goto _L16; else goto _L15
_L15:
        obj2 = obj1;
        if (W < k2)
        {
            continue; /* Loop/switch isn't completed */
        }
_L19:
        if (T == hec2.g && U == hec2.h)
        {
            obj2 = obj1;
            if (k1 != hec2.g)
            {
                break; /* Loop/switch isn't completed */
            }
            obj2 = obj1;
            if (i2 != hec2.h)
            {
                break; /* Loop/switch isn't completed */
            }
        }
        obj2 = obj1;
        if (a(T, k1, hec2.g))
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = obj1;
        if (a(U, i2, hec2.h))
        {
            break; /* Loop/switch isn't completed */
        }
        if (hec2.g != 0 && T != 0)
        {
            obj2 = obj1;
            if (k1 == 0)
            {
                break; /* Loop/switch isn't completed */
            }
        }
        if (hec2.h != 0 && U != 0)
        {
            obj2 = obj1;
            if (i2 == 0)
            {
                break; /* Loop/switch isn't completed */
            }
        }
        break; /* Loop/switch isn't completed */
        if (true) goto _L18; else goto _L17
_L18:
        break; /* Loop/switch isn't completed */
_L17:
        T = k1;
        U = i2;
        V = j2;
        W = k2;
        obj2 = s4;
        break; /* Loop/switch isn't completed */
_L16:
        obj2 = obj1;
        if (W > k2) goto _L14; else goto _L19
_L9:
        if (obj1 == null) goto _L6; else goto _L20
_L20:
        L = new File(file, ((String) (obj1)));
        if (hec2.d.e() != hee.a) goto _L6; else goto _L21
_L21:
        if (hec2.g == 0 || T == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        d = (double)T / (double)hec2.g;
_L27:
        if (d < 2D) goto _L6; else goto _L22
_L22:
        j1 = (int)Math.pow(2D, Math.floor(Math.log(d) / Math.log(2D)));
        obj1 = g.a(a.l().getContentResolver(), Uri.fromFile(L), j1, null);
        if (obj1 == null) goto _L6; else goto _L23
_L23:
        l1 = ((Bitmap) (obj1)).getWidth();
        i1 = ((Bitmap) (obj1)).getHeight();
        if (T == 0) goto _L25; else goto _L24
_L24:
        i1 = T - l1 * j1;
_L28:
        if (Math.abs(i1) < j1)
        {
            T = T / j1;
            U = U / j1;
            String s2 = a(hec2.d, hec2.b, T, U, V, W);
            a(((Bitmap) (obj1)), s2);
            L = new File(a.b().b(s2));
        }
          goto _L6
        exception;
        Log.e("ImageResource", "Cannot save downsampled bitmap", exception);
          goto _L6
        if (hec2.h == 0 || U == 0) goto _L6; else goto _L26
_L26:
        d = (double)U / (double)hec2.h;
          goto _L27
_L25:
        l1 = U;
        i1 = l1 - i1 * j1;
          goto _L28
_L6:
        Object obj1;
        Exception exception;
        Object obj2;
        String s4;
        String as[];
        int i1;
        int l1;
        int k2;
        if (L != null)
        {
            if (Log.isLoggable("ImageResource", 3))
            {
                obj = String.valueOf(L.getParent());
                s1 = String.valueOf(L.getName());
                (new StringBuilder(String.valueOf(obj).length() + 24 + String.valueOf(s1).length())).append("Cached resource found: ").append(((String) (obj))).append("/").append(s1);
            }
            return L;
        }
        if (!Log.isLoggable("ImageResource", 3));
          goto _L1
_L3:
        D();
        return L;
    }

    protected void j()
    {
        Object obj;
        obj = (hec)c;
        if (N == null && ((hec) (obj)).e == 5 && (((hec) (obj)).b & 0x400) == 0)
        {
            N = F();
            if (N.d != null && (((hec) (obj)).b & 0x8000) != 0 && E())
            {
                N = N.d;
            }
        }
        obj = ((hec)c).d;
        if (!((hdy) (obj)).h()) goto _L2; else goto _L1
_L1:
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Context context;
        int i1;
        int j1;
        int k1;
        int l1;
        long l2;
        boolean flag;
        boolean flag1;
        boolean flag2;
        obj = ((hdy) (obj)).c();
        obj1 = ((Uri) (obj)).getScheme();
        obj2 = (hdu)hlp.b(a.l(), hdu);
        String s1;
        boolean flag3;
        if (obj2 != null && ((hdu) (obj2)).b())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (obj1 == null || ((String) (obj1)).startsWith("http") || i1 != 0) goto _L2; else goto _L3
_L3:
        if (obj == null) goto _L5; else goto _L4
_L4:
        l2 = SystemClock.currentThreadTimeMillis();
        context = a.l();
        obj3 = (hec)c;
        obj4 = ((hec) (obj3)).d.c();
        if (A())
        {
            obj = String.valueOf(obj4);
            (new StringBuilder(String.valueOf(obj).length() + 23)).append("Loading local resource ").append(((String) (obj)));
        }
        O = hpj.b(context.getContentResolver(), ((Uri) (obj4)));
        flag = hpj.c(O);
        flag1 = hpj.a(O);
        flag2 = hpj.b(((Uri) (obj4)));
        flag3 = hpj.a(((Uri) (obj4)));
        if (!flag && !flag1)
        {
            hhh.a(context).a(((Uri) (obj4)), O, this, this);
        } else
        if (flag1)
        {
            h = 2;
            a.b(this, 2);
        }
        obj1 = null;
        obj2 = null;
        k1 = ((hec) (obj3)).g;
        l1 = ((hec) (obj3)).h;
        if (((hec) (obj3)).e != 2) goto _L7; else goto _L6
_L6:
        i1 = G;
        j1 = i1;
_L17:
        obj = null;
        if (!flag3) goto _L9; else goto _L8
_L8:
        obj = String.valueOf(((Uri) (obj4)).getPath());
        s1 = String.valueOf("-thumb");
        if (s1.length() == 0) goto _L11; else goto _L10
_L10:
        obj = ((String) (obj)).concat(s1);
_L22:
        obj = new File(((String) (obj)));
_L9:
        if (((hec) (obj3)).e != 2 || obj == null) goto _L13; else goto _L12
_L12:
        if (!((File) (obj)).exists()) goto _L13; else goto _L14
_L14:
        obj = g.a(((File) (obj)), false);
        obj1 = obj2;
_L28:
        if (obj1 != null)
        {
            try
            {
                if ((((hec) (obj3)).b & 1) == 0)
                {
                    l2 = SystemClock.currentThreadTimeMillis();
                    a(((Bitmap) (obj1)), f());
                    if (A())
                    {
                        obj = String.valueOf(c);
                        obj2 = String.valueOf(h());
                        obj3 = String.valueOf(g.d(SystemClock.currentThreadTimeMillis() - l2));
                        (new StringBuilder(String.valueOf(obj).length() + 62 + String.valueOf(obj2).length() + String.valueOf(obj3).length())).append("Saved local thumbnail in file cache: ").append(((String) (obj))).append(" file name: ").append(((String) (obj2))).append(" time spent: ").append(((String) (obj3)));
                    }
                }
                c(obj1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                a(6);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                a(3);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                a(5);
            }
            return;
        }
          goto _L15
_L2:
        obj = null;
          goto _L3
_L7:
        i1 = l1;
        j1 = k1;
        ((hec) (obj3)).e;
        JVM INSTR tableswitch 0 5: default 1820
    //                   0 372
    //                   1 372
    //                   2 692
    //                   3 709
    //                   4 692
    //                   5 721;
           goto _L16 _L17 _L17 _L16 _L18 _L16 _L19
_L16:
        throw new UnsupportedOperationException();
_L18:
        i1 = H;
        j1 = i1;
          goto _L17
_L19:
        i1 = l1;
        j1 = k1;
        if (k1 != 0) goto _L17; else goto _L20
_L20:
        i1 = l1;
        j1 = k1;
        if (l1 != 0) goto _L17; else goto _L21
_L21:
        i1 = H;
        j1 = i1;
          goto _L17
_L11:
        obj = new String(((String) (obj)));
          goto _L22
_L13:
        if (!flag1) goto _L24; else goto _L23
_L23:
        if ((((hec) (obj3)).b & 4) == 0) goto _L24; else goto _L25
_L25:
        if (!G()) goto _L27; else goto _L26
_L26:
        obj = g.a(K, false);
        obj1 = obj2;
          goto _L28
_L24:
        if (!flag2) goto _L30; else goto _L29
_L29:
        obj = (hec)c;
        if (((hec) (obj)).e != 2 && !flag) goto _L32; else goto _L31
_L31:
        if (j1 != 0 || i1 != 0) goto _L34; else goto _L33
_L33:
        throw new IllegalArgumentException("Both width and height cannot be zero.");
_L34:
        obj1 = a.a(512, 384);
        if (obj4 != null) goto _L36; else goto _L35
_L35:
        obj = null;
_L57:
        if (obj == obj1) goto _L38; else goto _L37
_L37:
        a.a(((Bitmap) (obj1)));
_L38:
        float f1;
        l1 = ((Bitmap) (obj)).getWidth();
        k1 = ((Bitmap) (obj)).getHeight();
        f1 = (float)l1 / (float)k1;
        if (j1 != 0) goto _L40; else goto _L39
_L39:
        j1 = Math.round(f1 * (float)i1);
_L67:
        j1 = Math.min(l1, j1);
        i1 = Math.min(k1, i1);
        obj1 = a(context, ((Uri) (obj4)), ((Bitmap) (obj)));
        if (obj1 == obj) goto _L42; else goto _L41
_L41:
        a.a(((Bitmap) (obj)));
_L42:
        obj2 = a.a(j1, i1);
        if (obj1 != null) goto _L44; else goto _L43
_L43:
        obj = null;
_L70:
        if (obj1 == obj) goto _L46; else goto _L45
_L45:
        a.a(((Bitmap) (obj1)));
_L46:
        obj1 = obj;
        if (obj2 == obj)
        {
            break MISSING_BLOCK_LABEL_1072;
        }
        a.a(((Bitmap) (obj2)));
        obj1 = obj;
_L79:
        a(l2, "mediastore", -1, -1, -1, ((Bitmap) (obj1)));
        obj = null;
          goto _L28
_L36:
        if (!hpj.b(((Uri) (obj4)))) goto _L48; else goto _L47
_L47:
        Object obj5;
        obj = ((Uri) (obj4)).getPath();
        obj2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI.getPath();
        obj5 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI.getPath();
        float f2;
        float f3;
        long l3;
        if (((String) (obj)).startsWith(((String) (obj2))) || ((String) (obj)).startsWith(((String) (obj5))))
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
          goto _L49
_L88:
        obj2 = context.getContentResolver();
        l3 = ContentUris.parseId(((Uri) (obj4)));
        obj5 = new android.graphics.BitmapFactory.Options();
        if (android.os.Build.VERSION.SDK_INT < 19) goto _L51; else goto _L50
_L50:
        if (obj1 == null) goto _L53; else goto _L52
_L52:
        if (((Bitmap) (obj1)).getWidth() != 512 || ((Bitmap) (obj1)).getHeight() != 384) goto _L53; else goto _L54
_L54:
        obj5.inBitmap = ((Bitmap) (obj1));
_L51:
        obj = hpj.b(((android.content.ContentResolver) (obj2)), ((Uri) (obj4)));
        if (!hpj.b(((String) (obj)))) goto _L56; else goto _L55
_L55:
        obj = android.provider.MediaStore.Images.Thumbnails.getThumbnail(((android.content.ContentResolver) (obj2)), l3, 1, ((android.graphics.BitmapFactory.Options) (obj5)));
          goto _L57
_L53:
        if (!Log.isLoggable("MediaStoreUtil", 3)) goto _L51; else goto _L58
_L58:
        if (obj1 == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (obj1 == null) goto _L60; else goto _L59
_L59:
        k1 = ((Bitmap) (obj1)).getWidth();
_L89:
        if (obj1 == null) goto _L62; else goto _L61
_L61:
        l1 = ((Bitmap) (obj1)).getHeight();
_L90:
        (new StringBuilder(117)).append("getMediaStoreThumbnail: got null or bitmap with invalid dimensions null? ").append(flag).append(" width: ").append(k1).append(" height: ").append(l1);
          goto _L51
_L56:
        if (!hpj.c(((String) (obj)))) goto _L64; else goto _L63
_L63:
        obj = android.provider.MediaStore.Video.Thumbnails.getThumbnail(((android.content.ContentResolver) (obj2)), l3, 1, ((android.graphics.BitmapFactory.Options) (obj5)));
          goto _L57
_L64:
        if (Log.isLoggable("MediaStoreUtil", 5))
        {
            obj2 = String.valueOf(obj4);
            (new StringBuilder(String.valueOf(obj).length() + 42 + String.valueOf(obj2).length())).append("getThumbnail: unrecognized mimeType=").append(((String) (obj))).append(", uri=").append(((String) (obj2)));
        }
          goto _L65
_L40:
        if (i1 != 0) goto _L67; else goto _L66
_L66:
        i1 = Math.round((float)j1 / f1);
          goto _L67
_L44:
        if (((Bitmap) (obj1)).getWidth() != j1 || ((Bitmap) (obj1)).getHeight() != i1) goto _L69; else goto _L68
_L68:
        obj = obj1;
          goto _L70
_L69:
        f2 = 0.0F;
        f1 = 0.0F;
        obj4 = new Matrix();
        if (((Bitmap) (obj1)).getWidth() * i1 <= ((Bitmap) (obj1)).getHeight() * j1) goto _L72; else goto _L71
_L71:
        f3 = (float)i1 / (float)((Bitmap) (obj1)).getHeight();
        f2 = ((float)j1 - (float)((Bitmap) (obj1)).getWidth() * f3) * 0.5F;
_L75:
        ((Matrix) (obj4)).setScale(f3, f3);
        ((Matrix) (obj4)).postTranslate((float)(int)f2 + 0.5F, (float)(int)f1 + 0.5F);
        if (obj2 == null) goto _L74; else goto _L73
_L73:
        obj = obj2;
_L76:
        (new Canvas(((Bitmap) (obj)))).drawBitmap(((Bitmap) (obj1)), ((Matrix) (obj4)), new Paint(3));
          goto _L70
_L72:
        f3 = (float)j1 / (float)((Bitmap) (obj1)).getWidth();
        f1 = ((float)i1 - (float)((Bitmap) (obj1)).getHeight() * f3) * 0.5F;
          goto _L75
_L74:
        obj = Bitmap.createBitmap(j1, i1, android.graphics.Bitmap.Config.ARGB_8888);
          goto _L76
_L32:
        if (((hec) (obj)).e != 1) goto _L78; else goto _L77
_L77:
        obj1 = g.a(context.getContentResolver(), ((Uri) (obj4)), a.a());
          goto _L79
_L78:
        obj1 = a(context, ((Uri) (obj4)), Math.max(j1, i1));
          goto _L79
_L30:
        if (!flag) goto _L81; else goto _L80
_L80:
        obj1 = g.a(context, ((Uri) (obj4)), j1, i1);
        a(l2, "video", -1, -1, -1, ((Bitmap) (obj1)));
        obj = null;
          goto _L28
_L81:
        if (((hec) (obj3)).e != 1) goto _L83; else goto _L82
_L82:
        obj1 = g.a(context.getContentResolver(), ((Uri) (obj4)), a.a());
_L84:
        a(l2, ((Uri) (obj4)).getAuthority(), -1, -1, -1, ((Bitmap) (obj1)));
          goto _L27
_L83:
        obj1 = a(context, ((Uri) (obj4)), Math.max(j1, i1));
          goto _L84
_L15:
        if (obj == null) goto _L86; else goto _L85
_L85:
        a(obj);
        return;
_L86:
        a(3);
        return;
_L5:
        super.j();
        return;
_L49:
        if (k1 != 0) goto _L88; else goto _L87
_L87:
        obj = null;
          goto _L57
_L48:
        k1 = 0;
          goto _L49
_L60:
        k1 = -1;
          goto _L89
_L62:
        l1 = -1;
          goto _L90
_L65:
        obj = null;
          goto _L57
_L27:
        obj = null;
          goto _L28
    }

    static 
    {
        k = new hed(3, 0);
        l = new hed(6, 3);
        m = new hed(6, 2);
        n = new hed(6, 1);
        o = new hed(7, 3);
        p = new hed(7, 2);
        q = new hed(7, 1);
        r = new hed(8, 3);
        s = new hed(8, 2);
        t = new hed(8, 1);
        u = m.a(l);
        v = p.a(o);
        w = s.a(r);
        x = (new hed[] {
            l, k.a(l), u, o.a(l), p.a(m), n.a(m), q.a(m), r.a(m)
        });
        y = (new hed[] {
            k, o, v, r.a(p), m, s.a(p), n.a(p), q.a(p)
        });
        z = (new hed[] {
            k, r, w, p, n.a(s), q.a(s), t.a(s)
        });
    }
}
