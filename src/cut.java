// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.phone.ShowToastForTesting;
import com.google.api.client.http.AbstractInputStreamContent;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.InputStreamContent;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class cut extends cua
{

    private static final Pattern H = Pattern.compile("\\*\\*\\*([\\w]{1})(\\d*)(p?)\\*\\*\\*");
    private static final long serialVersionUID = 1L;
    final boolean A;
    final int B;
    final String C;
    final int D;
    public final long E;
    private long F;
    private transient InputStream G;
    private long I;
    private int J;
    private long K;
    private long L;
    private boolean M;
    private boolean N;
    private boolean O;
    final String a;
    public final long b;
    public final List k;
    public final String l;
    final String m;
    final int n;
    final String o;
    final String p;
    public final String q;
    public final String r;
    public final double s;
    public final double t;
    public final String u;
    public final String v;
    public final String w;
    public final int x;
    public final int y;
    public final boolean z;

    public cut(String s1, String s2, String s3, long l1, List list, String s4, 
            String s5, String s6, int i, String s7, int j, int i1, String s8, 
            String s9, double d, double d1, String s10, String s11, 
            String s12, boolean flag, int j1, String s13, int k1)
    {
        super(s2, s1);
        F = -1L;
        I = 0L;
        J = 0;
        K = 0L;
        L = 0L;
        M = false;
        N = false;
        O = false;
        if (this.j == null)
        {
            throw new NullPointerException("null clientGeneratedId");
        } else
        {
            a = s3;
            b = l1;
            k = list;
            l = s4;
            p = s5;
            m = s6;
            n = i;
            o = s7;
            y = j;
            x = i1;
            q = s8;
            r = s9;
            s = d;
            t = d1;
            u = s10;
            v = s11;
            w = s12;
            E = System.currentTimeMillis();
            z = flag;
            A = false;
            B = j1;
            C = s13;
            D = k1;
            s();
            return;
        }
    }

    private dbo c(long l1, int i)
    {
        if (K > 0L)
        {
            if (System.currentTimeMillis() < K + l1)
            {
                return new dbo(102, null, 0L, true, null);
            }
        } else
        if (J > 0)
        {
            if (J > i)
            {
                return new dbo(102, null, 0L, true, null);
            }
        } else
        {
            if (M && i < 5)
            {
                Intent intent = new Intent();
                intent.setClass(g.nS, com/google/android/apps/hangouts/phone/ShowToastForTesting);
                intent.putExtra("toast_text", "authentication");
                return new dbo(100, new dzf(intent), 0L, true, null);
            }
            if (O)
            {
                return new dbo(109, null, 0L, true, null);
            }
            if (L > 0L && i == 0)
            {
                return new dbo(105, null, L, true, null);
            }
        }
        return null;
    }

    private void s()
    {
        if (k != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Iterator iterator = k.iterator();
_L5:
        if (!iterator.hasNext()) goto _L1; else goto _L3
_L3:
        Object obj = (crr)iterator.next();
        if (((crr) (obj)).a != 0) goto _L5; else goto _L4
_L4:
        obj = ((crr) (obj)).b;
        if (obj == null) goto _L5; else goto _L6
_L6:
        int i;
        obj = H.matcher(((CharSequence) (obj)));
        i = 0;
_L17:
        if (!((Matcher) (obj)).find(i)) goto _L5; else goto _L7
_L7:
        String s1;
        String s2;
        String s3;
        s1 = ((Matcher) (obj)).group(1);
        s2 = ((Matcher) (obj)).group(2);
        s3 = ((Matcher) (obj)).group(3);
        if (!TextUtils.isEmpty(s2)) goto _L9; else goto _L8
_L8:
        i = 0;
_L18:
        s1.charAt(0);
        JVM INSTR lookupswitch 12: default 426
    //                   65: 372
    //                   67: 251
    //                   70: 388
    //                   77: 330
    //                   83: 404
    //                   84: 288
    //                   97: 372
    //                   99: 251
    //                   102: 388
    //                   109: 330
    //                   115: 404
    //                   116: 288;
           goto _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L11 _L12 _L13 _L14 _L15 _L16
_L10:
        N = N | "p".equals(s3);
_L19:
        i = ((Matcher) (obj)).end();
          goto _L17
_L9:
        i = Integer.parseInt(s2);
          goto _L18
_L12:
        ebw.f("Babel_RequestWriter", (new StringBuilder(38)).append("failure injection counter: ").append(i).toString());
        J = i;
          goto _L10
_L16:
        ebw.f("Babel_RequestWriter", (new StringBuilder(35)).append("failure injection time: ").append(i).toString());
        K = i * 1000;
          goto _L10
_L14:
        ebw.f("Babel_RequestWriter", (new StringBuilder(42)).append("failure injection max latency: ").append(i).toString());
        I = i * 1000;
          goto _L10
_L11:
        ebw.f("Babel_RequestWriter", "failure inject auth error");
        M = true;
          goto _L10
_L13:
        ebw.f("Babel_RequestWriter", "failure inject fatal (retry limit)");
        O = true;
          goto _L10
_L15:
        ebw.f("Babel_RequestWriter", "failure inject server backoff");
        L = i * 1000;
          goto _L10
        NumberFormatException numberformatexception;
        numberformatexception;
          goto _L19
    }

    public dbo a(long l1, int i)
    {
        if (!N)
        {
            return c(l1, i);
        } else
        {
            return null;
        }
    }

    public kop a(String s1, int i, int j)
    {
        Object obj;
        Object obj1;
        int i1;
        if (ebw.a("Babel_RequestWriter", 3))
        {
            obj = String.valueOf(this.j);
            crr crr1;
            kur kur1;
            kuo kuo1;
            int j1;
            if (((String) (obj)).length() != 0)
            {
                obj = "sendMessage build protobuf clientGeneratedId=".concat(((String) (obj)));
            } else
            {
                obj = new String("sendMessage build protobuf clientGeneratedId=");
            }
            ebw.d("Babel_RequestWriter", ((String) (obj)));
        }
        obj1 = new itb();
        obj1.b = aoe.c(this.j);
        if (!g.a(g.nS, "babel_contingency_mode_enabled", false) && !A)
        {
            obj1.a = ctq.a(c);
        }
        if (z)
        {
            i1 = 1;
        } else
        {
            i1 = 2;
        }
        obj1.c = Integer.valueOf(i1);
        obj = new isa();
        obj.a = Integer.valueOf(B);
        if (C != null)
        {
            obj.b = new jtj();
            ((isa) (obj)).b.a = C;
        }
        obj1.d = ((isa) (obj));
        obj1.e = Integer.valueOf(D);
        obj = new ixn();
        obj.a = ((itb) (obj1));
        obj1 = new ivm();
        j1 = k.size();
        if (j1 > 0)
        {
            kur akur[] = new kur[j1];
            for (i1 = 0; i1 < j1; i1++)
            {
                crr1 = (crr)k.get(i1);
                kur1 = new kur();
                if (crr1.b != null)
                {
                    kur1.b = crr1.b;
                }
                if (crr1.d != null)
                {
                    kur1.d = new kuq();
                    kur1.d.a = crr1.d;
                    kur1.b = crr1.b;
                }
                if (crr1.c != 0)
                {
                    kuo1 = new kuo();
                    if ((crr1.c & 1) != 0)
                    {
                        kuo1.a = Boolean.valueOf(true);
                    }
                    if ((crr1.c & 2) != 0)
                    {
                        kuo1.b = Boolean.valueOf(true);
                    }
                    if ((crr1.c & 4) != 0)
                    {
                        kuo1.c = Boolean.valueOf(true);
                    }
                    if ((crr1.c & 8) != 0)
                    {
                        kuo1.d = Boolean.valueOf(true);
                    }
                    kur1.c = kuo1;
                }
                kur1.a = Integer.valueOf(crr1.a);
                akur[i1] = kur1;
            }

            obj1.a = akur;
        }
        obj.e = ((ivm) (obj1));
        if (!TextUtils.isEmpty(l))
        {
            obj.f = new itc();
            ((ixn) (obj)).f.b = new ite();
            ((ixn) (obj)).f.b.b = l;
            if (p != null)
            {
                ((ixn) (obj)).f.b.a = p;
                ((ixn) (obj)).f.b.d = Boolean.valueOf(true);
            }
        }
        if ("hangouts/location".equals(m))
        {
            if (ctr.e)
            {
                obj1 = q;
                String s2 = o;
                ebw.b("Babel_RequestWriter", (new StringBuilder(String.valueOf(obj1).length() + 22 + String.valueOf(s2).length())).append("Sending location: ").append(((String) (obj1))).append("url:").append(s2).toString());
            }
            Object obj2 = new kpo();
            obj2.n = Double.valueOf(s);
            obj2.o = Double.valueOf(t);
            obj1 = new koz();
            ((koz) (obj1)).setExtension(kpo.a, obj2);
            Object obj3 = new kpp();
            obj3.c = o;
            obj2 = new koz();
            ((koz) (obj2)).setExtension(kpp.a, obj3);
            Object obj4 = new kqq();
            obj4.s = u;
            obj3 = new koz();
            ((koz) (obj3)).setExtension(kqq.a, obj4);
            obj4 = new kpv();
            if (!TextUtils.isEmpty(q))
            {
                obj4.e = q;
            }
            obj4.w = ((koz) (obj2));
            obj4.o = ((koz) (obj1));
            obj4.n = ((koz) (obj3));
            obj1 = new ivb();
            obj1.a = ((kpv) (obj4));
            obj.g = ((ivb) (obj1));
        }
        if (a != null)
        {
            obj.d = new ius();
            ((ixn) (obj)).d.a = a;
        }
        obj1 = new iqu();
        obj1.a = Long.valueOf(b);
        obj.requestHeader = ctq.a(((iqu) (obj1)), false, s1, i, j, h);
        return ((kop) (obj));
    }

    public void a(ani ani1, dbo dbo1)
    {
        super.a(ani1, dbo1);
        if (dbo1 != null && dbo1.c() != 0)
        {
            g.a(ani1, 1523);
            new aoe(g.nS, ani1.h());
            h.a(ani1.h(), System.currentTimeMillis(), 5, (new byy()).a(dbo1.c()).b(j).a(c));
        }
    }

    public boolean a(cci cci, dbo dbo1)
    {
label0:
        {
            boolean flag = super.a(cci, dbo1);
            if (dbo1.c() == 101)
            {
                if (((alw)hgx.a(g.nS, alw)).a("babel_pending_chat_message_failure_duration", 0L) != 0L)
                {
                    break label0;
                }
                flag = false;
            }
            return flag;
        }
        return true;
    }

    public boolean a(String s1)
    {
        return s1.startsWith(j);
    }

    public long b()
    {
        if (I == 0L)
        {
            long l2 = g.a(g.nS, "babel_pending_chat_message_failure_duration", 0L);
            long l1 = l2;
            if (l2 == 0L)
            {
                l1 = super.b();
            }
            return l1;
        } else
        {
            return I;
        }
    }

    public HttpContent b(String s1, int i, int j)
    {
        s1 = a(s1, i, j);
        if (s1 != null)
        {
            this.i = s1.toString();
        }
        return new csj(s1);
    }

    public dbo b(long l1, int i)
    {
        if (N)
        {
            return c(l1, i);
        } else
        {
            return null;
        }
    }

    public boolean c()
    {
        return true;
    }

    public String e()
    {
        if (k.size() == 1)
        {
            String s1 = ((crr)k.get(0)).b;
            if (g.w(s1))
            {
                return s1;
            }
        }
        return null;
    }

    protected String f()
    {
        String s1;
        String s2;
        if (r())
        {
            s1 = "https://www.googleapis.com/chat/v1android/";
        } else
        {
            s1 = "https://www.googleapis.com/upload/chat/v1android/";
        }
        s1 = String.valueOf(s1);
        s2 = String.valueOf(g());
        if (s2.length() != 0)
        {
            return s1.concat(s2);
        } else
        {
            return new String(s1);
        }
    }

    public String g()
    {
        return "conversations/sendchatmessage";
    }

    public ccg n()
    {
        return new dhq(this);
    }

    public int o()
    {
        return 4;
    }

    public AbstractInputStreamContent p()
    {
        boolean flag;
        flag = true;
        gbh.b(r());
        if (o == null) goto _L2; else goto _L1
_L1:
        ContentResolver contentresolver = g.nS.getContentResolver();
        if (!"image/gif".equals(m) && g.b(m)) goto _L4; else goto _L3
_L3:
        try
        {
            Uri uri = Uri.parse(o);
            G = contentresolver.openInputStream(uri);
            F = (new File(uri.getPath())).length();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ebw.e("Babel_RequestWriter", "FileNotFoundException trying to detect how large the  attachment is", ((Throwable) (obj)));
        }
_L2:
        if (G == null)
        {
            Object obj = String.valueOf(o);
            byte abyte0[];
            android.graphics.Bitmap bitmap;
            FileNotFoundException filenotfoundexception;
            byte abyte1[];
            int i;
            if (((String) (obj)).length() != 0)
            {
                obj = "We could not create an inputStream for the uri: ".concat(((String) (obj)));
            } else
            {
                obj = new String("We could not create an inputStream for the uri: ");
            }
            ebw.f("Babel_RequestWriter", ((String) (obj)));
            return null;
        } else
        {
            InputStreamContent inputstreamcontent = new InputStreamContent(m, G);
            inputstreamcontent.setLength(F);
            return inputstreamcontent;
        }
_L4:
        i = g.a(g.nS, "babel_thumbnail_photo_upload_size", 320);
        obj = ean.a();
        abyte0 = ean.a(g.nS.getContentResolver().openInputStream(Uri.parse(o)));
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_352;
        }
        if (abyte0.length <= 0)
        {
            break MISSING_BLOCK_LABEL_352;
        }
        if (!o.startsWith(EsProvider.c(g.nS))) goto _L6; else goto _L5
_L5:
        ebw.e("Babel_RequestWriter", "Sending cache file.");
        G = new ByteArrayInputStream(abyte0);
        F = abyte0.length;
_L7:
        if (!flag)
        {
            obj = String.valueOf(o);
            if (((String) (obj)).length() != 0)
            {
                obj = "Failing to send image for uri: ".concat(((String) (obj)));
            } else
            {
                obj = new String("Failing to send image for uri: ");
            }
            ebw.f("Babel_RequestWriter", ((String) (obj)));
        }
          goto _L2
_L6:
        bitmap = ((dzl) (obj)).a(abyte0, i, i, n);
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_352;
        }
        abyte1 = ean.a(bitmap, 70);
        ((dzl) (obj)).a(bitmap);
        if (abyte1 == null)
        {
            break MISSING_BLOCK_LABEL_352;
        }
        if (abyte1.length <= 0)
        {
            break MISSING_BLOCK_LABEL_352;
        }
        G = new ByteArrayInputStream(abyte1);
        F = abyte1.length;
          goto _L7
        filenotfoundexception;
        obj = String.valueOf(o);
        if (((String) (obj)).length() != 0)
        {
            obj = "Could not open file corresponding to uri ".concat(((String) (obj)));
        } else
        {
            obj = new String("Could not open file corresponding to uri ");
        }
        ebw.e("Babel_RequestWriter", ((String) (obj)), filenotfoundexception);
        flag = false;
          goto _L7
    }

    public int q()
    {
        return r() ? 0 : 1;
    }

    public boolean r()
    {
        return o == null || "hangouts/location".equals(m) || p != null;
    }

    public String toString()
    {
        String s1 = super.toString();
        String s2 = String.valueOf(ebw.b(g.a(k, null)));
        return (new StringBuilder(String.valueOf(s1).length() + 7 + String.valueOf(s2).length())).append(s1).append("text [").append(s2).append("]").toString();
    }

}
