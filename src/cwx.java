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

public class cwx extends cwe
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

    public cwx(String s1, String s2, String s3, long l1, List list, String s4, 
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
            r();
            return;
        }
    }

    private dcx c(long l1, int i)
    {
        if (K > 0L)
        {
            if (System.currentTimeMillis() < K + l1)
            {
                return new dcx(102, null, 0L, true, null);
            }
        } else
        if (J > 0)
        {
            if (J > i)
            {
                return new dcx(102, null, 0L, true, null);
            }
        } else
        {
            if (M && i < 5)
            {
                Intent intent = new Intent();
                intent.setClass(g.nU, com/google/android/apps/hangouts/phone/ShowToastForTesting);
                intent.putExtra("toast_text", "authentication");
                return new dcx(100, new ecm(intent), 0L, true, null);
            }
            if (O)
            {
                return new dcx(109, null, 0L, true, null);
            }
            if (L > 0L && i == 0)
            {
                return new dcx(105, null, L, true, null);
            }
        }
        return null;
    }

    private void r()
    {
        if (k != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Iterator iterator = k.iterator();
_L5:
        if (!iterator.hasNext()) goto _L1; else goto _L3
_L3:
        Object obj = (dmt)iterator.next();
        if (((dmt) (obj)).a != 0) goto _L5; else goto _L4
_L4:
        obj = ((dmt) (obj)).b;
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
        eev.f("Babel_RequestWriter", (new StringBuilder(38)).append("failure injection counter: ").append(i).toString());
        J = i;
          goto _L10
_L16:
        eev.f("Babel_RequestWriter", (new StringBuilder(35)).append("failure injection time: ").append(i).toString());
        K = i * 1000;
          goto _L10
_L14:
        eev.f("Babel_RequestWriter", (new StringBuilder(42)).append("failure injection max latency: ").append(i).toString());
        I = i * 1000;
          goto _L10
_L11:
        eev.f("Babel_RequestWriter", "failure inject auth error");
        M = true;
          goto _L10
_L13:
        eev.f("Babel_RequestWriter", "failure inject fatal (retry limit)");
        O = true;
          goto _L10
_L15:
        eev.f("Babel_RequestWriter", "failure inject server backoff");
        L = i * 1000;
          goto _L10
        NumberFormatException numberformatexception;
        numberformatexception;
          goto _L19
    }

    public dcx a(long l1, int i)
    {
        if (!N)
        {
            return c(l1, i);
        } else
        {
            return null;
        }
    }

    public kws a(String s1, int i, int j)
    {
        Object obj;
        Object obj1;
        int i1;
        if (eev.a("Babel_RequestWriter", 3))
        {
            obj = String.valueOf(this.j);
            dmt dmt1;
            lcv lcv1;
            lcs lcs1;
            int j1;
            if (((String) (obj)).length() != 0)
            {
                obj = "sendMessage build protobuf clientGeneratedId=".concat(((String) (obj)));
            } else
            {
                obj = new String("sendMessage build protobuf clientGeneratedId=");
            }
            eev.d("Babel_RequestWriter", ((String) (obj)));
        }
        obj1 = new izg();
        obj1.b = aow.c(this.j);
        if (!g.a(g.nU, "babel_contingency_mode_enabled", false) && !A)
        {
            obj1.a = cvu.a(c);
        }
        if (z)
        {
            i1 = 1;
        } else
        {
            i1 = 2;
        }
        obj1.c = Integer.valueOf(i1);
        obj = new iyf();
        obj.a = Integer.valueOf(B);
        if (C != null)
        {
            obj.b = new kbm();
            ((iyf) (obj)).b.a = C;
        }
        obj1.d = ((iyf) (obj));
        obj1.e = Integer.valueOf(D);
        obj = new jds();
        obj.a = ((izg) (obj1));
        obj1 = new jbr();
        j1 = k.size();
        if (j1 > 0)
        {
            lcv alcv[] = new lcv[j1];
            for (i1 = 0; i1 < j1; i1++)
            {
                dmt1 = (dmt)k.get(i1);
                lcv1 = new lcv();
                if (dmt1.b != null)
                {
                    lcv1.b = dmt1.b;
                }
                if (dmt1.d != null)
                {
                    lcv1.d = new lcu();
                    lcv1.d.a = dmt1.d;
                    lcv1.b = dmt1.b;
                }
                if (dmt1.c != 0)
                {
                    lcs1 = new lcs();
                    if ((dmt1.c & 1) != 0)
                    {
                        lcs1.a = Boolean.valueOf(true);
                    }
                    if ((dmt1.c & 2) != 0)
                    {
                        lcs1.b = Boolean.valueOf(true);
                    }
                    if ((dmt1.c & 4) != 0)
                    {
                        lcs1.c = Boolean.valueOf(true);
                    }
                    if ((dmt1.c & 8) != 0)
                    {
                        lcs1.d = Boolean.valueOf(true);
                    }
                    lcv1.c = lcs1;
                }
                lcv1.a = Integer.valueOf(dmt1.a);
                alcv[i1] = lcv1;
            }

            obj1.a = alcv;
        }
        obj.e = ((jbr) (obj1));
        if (!TextUtils.isEmpty(l))
        {
            obj.f = new izh();
            ((jds) (obj)).f.b = new izj();
            ((jds) (obj)).f.b.b = l;
            if (p != null)
            {
                ((jds) (obj)).f.b.a = p;
                ((jds) (obj)).f.b.d = Boolean.valueOf(true);
            }
        }
        if ("hangouts/location".equals(m))
        {
            if (cvv.e)
            {
                obj1 = q;
                String s2 = o;
                eev.b("Babel_RequestWriter", (new StringBuilder(String.valueOf(obj1).length() + 22 + String.valueOf(s2).length())).append("Sending location: ").append(((String) (obj1))).append("url:").append(s2).toString());
            }
            Object obj2 = new kxr();
            obj2.n = Double.valueOf(s);
            obj2.o = Double.valueOf(t);
            obj1 = new kxc();
            ((kxc) (obj1)).setExtension(kxr.a, obj2);
            Object obj3 = new kxs();
            obj3.c = o;
            obj2 = new kxc();
            ((kxc) (obj2)).setExtension(kxs.a, obj3);
            Object obj4 = new kyt();
            obj4.s = u;
            obj3 = new kxc();
            ((kxc) (obj3)).setExtension(kyt.a, obj4);
            obj4 = new kxy();
            if (!TextUtils.isEmpty(q))
            {
                obj4.e = q;
            }
            obj4.w = ((kxc) (obj2));
            obj4.o = ((kxc) (obj1));
            obj4.n = ((kxc) (obj3));
            obj1 = new jbg();
            obj1.a = ((kxy) (obj4));
            obj.g = ((jbg) (obj1));
        }
        if (a != null)
        {
            obj.d = new jax();
            ((jds) (obj)).d.a = a;
        }
        obj1 = new iwz();
        obj1.a = Long.valueOf(b);
        obj.requestHeader = cvu.a(((iwz) (obj1)), false, s1, i, j, h);
        return ((kws) (obj));
    }

    public void a(aoa aoa1, dcx dcx1)
    {
        super.a(aoa1, dcx1);
        if (dcx1 != null && dcx1.c() != 0)
        {
            g.a(aoa1, 1523);
            h.a(aoa1.h(), System.currentTimeMillis(), 5, (new cab()).a(dcx1.c()).b(j).a(c));
        }
    }

    public boolean a(cdn cdn, dcx dcx1)
    {
label0:
        {
            boolean flag = super.a(cdn, dcx1);
            if (dcx1.c() == 101)
            {
                if (((amo)hlp.a(g.nU, amo)).a("babel_pending_chat_message_failure_duration", 0L) != 0L)
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
            long l2 = g.a(g.nU, "babel_pending_chat_message_failure_duration", 0L);
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
        return new cum(s1);
    }

    public dcx b(long l1, int i)
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
            String s1 = ((dmt)k.get(0)).b;
            if (g.w(s1))
            {
                return s1;
            }
        }
        return null;
    }

    public String f()
    {
        return "conversations/sendchatmessage";
    }

    protected dmi g()
    {
        if (q())
        {
            return dmi.a;
        } else
        {
            return dmi.b;
        }
    }

    public cdl m()
    {
        return new diz(this);
    }

    public int n()
    {
        return 4;
    }

    public AbstractInputStreamContent o()
    {
        boolean flag;
        flag = true;
        gdv.b("Expected condition to be false", q());
        if (o == null) goto _L2; else goto _L1
_L1:
        ContentResolver contentresolver = g.nU.getContentResolver();
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
            eev.e("Babel_RequestWriter", "FileNotFoundException trying to detect how large the  attachment is", ((Throwable) (obj)));
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
            eev.f("Babel_RequestWriter", ((String) (obj)));
            return null;
        } else
        {
            InputStreamContent inputstreamcontent = new InputStreamContent(m, G);
            inputstreamcontent.setLength(F);
            return inputstreamcontent;
        }
_L4:
        i = g.a(g.nU, "babel_thumbnail_photo_upload_size", 320);
        obj = edr.a();
        abyte0 = edr.a(g.nU.getContentResolver().openInputStream(Uri.parse(o)));
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_355;
        }
        if (abyte0.length <= 0)
        {
            break MISSING_BLOCK_LABEL_355;
        }
        if (!o.startsWith(EsProvider.c(g.nU))) goto _L6; else goto _L5
_L5:
        eev.e("Babel_RequestWriter", "Sending cache file.");
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
            eev.f("Babel_RequestWriter", ((String) (obj)));
        }
          goto _L2
_L6:
        bitmap = ((ecp) (obj)).a(abyte0, i, i, n);
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_355;
        }
        abyte1 = edr.a(bitmap, 70);
        ((ecp) (obj)).a(bitmap);
        if (abyte1 == null)
        {
            break MISSING_BLOCK_LABEL_355;
        }
        if (abyte1.length <= 0)
        {
            break MISSING_BLOCK_LABEL_355;
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
        eev.e("Babel_RequestWriter", ((String) (obj)), filenotfoundexception);
        flag = false;
          goto _L7
    }

    public int p()
    {
        return q() ? 0 : 1;
    }

    public boolean q()
    {
        return o == null || "hangouts/location".equals(m) || p != null;
    }

    public String toString()
    {
        String s1 = String.valueOf(super.toString());
        String s2 = String.valueOf(eev.b(g.a(k, null)));
        return (new StringBuilder(String.valueOf(s1).length() + 7 + String.valueOf(s2).length())).append(s1).append("text [").append(s2).append("]").toString();
    }

}
