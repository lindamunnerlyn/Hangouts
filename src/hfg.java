// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public final class hfg
{

    private static final Bundle a;
    private static final long b;
    private static final Set c;
    private static final Pattern d = Pattern.compile("bytes=(\\d+)-(\\d+)");
    private static final hfk r = new hfh();
    private hfu e;
    private String f;
    private boolean g;
    private final Context h;
    private final hiv i;
    private final String j;
    private final String k;
    private final String l;
    private final hfk m;
    private final boolean n;
    private final hfr o;
    private final hen p;
    private final hfl q;

    hfg(hfi hfi1)
    {
        h = hfi1.a;
        j = hfi1.b;
        k = hfi1.c;
        l = hfi1.d;
        m = hfi1.e;
        n = hfi1.f;
        o = hfi1.g;
        q = (hfl)hlp.b(h, hfl);
        p = hfi1.h;
        i = new hiv(h, hfi1.b, "oauth2:https://www.googleapis.com/auth/plus.me https://www.googleapis.com/auth/plus.stream.read https://www.googleapis.com/auth/plus.stream.write https://www.googleapis.com/auth/plus.circles.write https://www.googleapis.com/auth/plus.circles.read https://www.googleapis.com/auth/plus.photos.readwrite https://www.googleapis.com/auth/plus.native");
    }

    private hff a(String s, hfv hfv1, boolean flag)
    {
        java.io.InputStream inputstream;
        m.a(0L, hfv1.k());
        if (Log.isLoggable("MediaUploader", 4))
        {
            int i1 = hfv1.hashCode();
            (new StringBuilder(28)).append("--- UPLOAD task: ").append(i1);
        }
        if (Log.isLoggable("MediaUploader", 2))
        {
            String s1 = String.valueOf("Uploading stream, resumeFingerprint: ");
            (new StringBuilder(String.valueOf(s1).length() + 50 + String.valueOf(null).length())).append(s1).append(null).append(", background: ").append(flag).append(", offset: 0)");
        }
        inputstream = hfv1.a(0L);
        Object obj = new hfj(this, hfv1.g(), hfv1.k(), 0L);
        Object obj1 = new hfu(h, i, s, hfv1.e(), 0L, hfv1.k(), inputstream, flag, ((hfx) (obj)));
        this;
        JVM INSTR monitorenter ;
        if (g)
        {
            throw new het();
        }
        break MISSING_BLOCK_LABEL_234;
        obj;
        this;
        JVM INSTR monitorexit ;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        finally
        {
            this;
        }
        throw new hfa(((IOException) (obj)).toString(), g.a(hfv1, s));
        e = null;
        this;
        JVM INSTR monitorexit ;
        h.a(inputstream);
        throw s;
        e = ((hfu) (obj1));
        this;
        JVM INSTR monitorexit ;
        int k1;
        a(((hfm) (obj1)));
        k1 = ((hfu) (obj1)).e();
        if (!a(k1)) goto _L2; else goto _L1
_L1:
        ((hfj) (obj)).a(hfv1.k(), hfv1.k());
        if (Log.isLoggable("MediaUploader", 3))
        {
            int j1 = (int)((hfm) (obj1)).f();
            (new StringBuilder(32)).append("parseResult: length: ").append(j1);
        }
        obj = ((hfm) (obj1)).g();
        obj = kwj.a(((byte []) (obj)), 0, obj.length);
        obj1 = new hyt();
        ((hyt) (obj1)).a(((kwj) (obj)));
        obj1 = ((hyt) (obj1)).a;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_373;
        }
        throw new hfc("Unable to parse UploadMediaResponse");
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        if (((hzm) (obj1)).d != null) goto _L5; else goto _L4
_L10:
        if (((hzm) (obj1)).a == null) goto _L7; else goto _L6
_L6:
        iex iex1 = ((hzm) (obj1)).a;
        if (iex1.c == null) goto _L9; else goto _L8
_L8:
        obj1 = iex1.c.a;
_L12:
        String s2;
        if (iex1.q == null)
        {
            break MISSING_BLOCK_LABEL_967;
        }
        s2 = iex1.q.i;
_L13:
        String s3 = iex1.i;
        obj = new hff(((hfq) (obj)), ((String) (obj1)), (long)(g.a(iex1.u) * 1000D), iex1.h, hfv1.k(), s2, s3);
_L11:
        hfo.a();
        this;
        JVM INSTR monitorenter ;
        e = null;
        this;
        JVM INSTR monitorexit ;
        h.a(inputstream);
        return ((hff) (obj));
_L5:
        obj = ((hzm) (obj1)).d;
        long l1;
        long l2;
        long l3;
        long l4;
        boolean flag2;
        l1 = -1L;
        l2 = -1L;
        flag = false;
        flag2 = false;
        l4 = l1;
        l3 = l2;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_614;
        }
        if (((ifc) (obj)).b != null)
        {
            l1 = ((ifc) (obj)).b.longValue() / 0x100000L;
        }
        if (((ifc) (obj)).a != null)
        {
            l2 = ((ifc) (obj)).a.longValue() / 0x100000L;
        }
        flag = g.a(((ifc) (obj)).d, false);
        flag2 = g.a(((ifc) (obj)).c, false);
        l3 = l2;
        l4 = l1;
        obj = new hfq(l4, l3, flag, flag2);
          goto _L10
_L7:
        if (((hzm) (obj1)).e == null)
        {
            break MISSING_BLOCK_LABEL_737;
        }
        s2 = null;
        iex1 = null;
        kpn kpn1 = ((hzm) (obj1)).e;
        obj1 = iex1;
        String s4;
        if (kpn1.b == null)
        {
            break MISSING_BLOCK_LABEL_712;
        }
        s4 = kpn1.b.a;
        obj1 = iex1;
        s2 = s4;
        if (kpn1.b.b == null)
        {
            break MISSING_BLOCK_LABEL_712;
        }
        obj1 = kpn1.b.b.c;
        s2 = s4;
        obj = new hff(((hfq) (obj)), null, 0L, ((String) (obj1)), hfv1.k(), null, s2);
          goto _L11
        throw new hfc("Unsupported UploadMediaResponse type");
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
_L2:
        boolean flag1;
        if (k1 == 308)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_780;
        }
        throw new hfc("uploaded full stream but server returned incomplete");
        if (k1 != 400)
        {
            break MISSING_BLOCK_LABEL_819;
        }
        throw new hfc((new StringBuilder(55)).append("upload failed (bad payload, file too large) ").append(k1).toString());
        if (k1 < 500 || k1 >= 600)
        {
            break MISSING_BLOCK_LABEL_871;
        }
        throw new hfa((new StringBuilder(33)).append("upload transient error").append(k1).toString(), g.a(hfv1, s));
        if (((hfj) (obj)).a())
        {
            throw ((hfj) (obj)).b();
        }
        if (((hfu) (obj1)).i())
        {
            throw new het(((hfu) (obj1)).h(), g.a(hfv1, s));
        }
        if (((hfu) (obj1)).h() != null)
        {
            throw new hfa(((hfu) (obj1)).h(), g.a(hfv1, s));
        } else
        {
            throw new hfc(Integer.toString(k1));
        }
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
_L4:
        obj = null;
          goto _L10
_L9:
        obj1 = null;
          goto _L12
        s2 = null;
          goto _L13
    }

    static hfk a(hfg hfg1)
    {
        return hfg1.m;
    }

    private hfm a(hfm hfm1)
    {
        hfm1.a();
        b();
        long l1 = SystemClock.elapsedRealtime();
        hfm1.d();
        hfo.a(SystemClock.elapsedRealtime() - l1);
        int i1 = hfm1.e();
        if (i1 == 401 || i1 == 403)
        {
            long l2;
            try
            {
                hfm1.j().a();
                hfm1.a();
            }
            // Misplaced declaration of an exception variable
            catch (hfm hfm1)
            {
                throw new hfb(hfm1);
            }
            b();
            l2 = SystemClock.elapsedRealtime();
            hfm1.d();
            hfo.a(SystemClock.elapsedRealtime() - l2);
        }
        return hfm1;
    }

    private static boolean a(int i1)
    {
        return i1 == 200 || i1 == 201;
    }

    static hfk c()
    {
        return r;
    }

    static long d()
    {
        return b;
    }

    public hff a(hfs hfs1)
    {
        Object obj1;
        String s;
        obj1 = null;
        s = null;
        Object obj = new hfv(h, hfs1.a(), hfs1.b(), hfs1.d(), hfs1.l(), hfs1.m(), hfs1.n());
        if (!hfs1.i() && g.b(h, hfs1.a()))
        {
            ((hfv) (obj)).a();
        }
        if (!TextUtils.isEmpty(hfs1.c()))
        {
            ((hfv) (obj)).a(hfs1.c());
        }
        if (hfs1.h() > 0L)
        {
            ((hfv) (obj)).b(hfs1.h());
        }
        obj1 = ((hfv) (obj)).e();
        if (c.contains(obj1))
        {
            throw new hev(((String) (obj1)), false);
        }
          goto _L1
        obj1;
        hfs1 = ((hfs) (obj));
        obj = obj1;
_L24:
        throw new hex(((Throwable) (obj)));
        obj;
        obj1 = hfs1;
        hfs1 = ((hfs) (obj));
_L7:
        int i1;
        boolean flag;
        String s1;
        String s2;
        Context context;
        hiv hiv1;
        String s3;
        String s4;
        if (obj1 != null)
        {
            try
            {
                if (((hfv) (obj1)).b())
                {
                    (new File(((hfv) (obj1)).c().getPath())).delete();
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        g = false;
        throw hfs1;
_L1:
        if (obj1 == null) goto _L3; else goto _L2
_L2:
        if (!((String) (obj1)).startsWith("image/") && !((String) (obj1)).startsWith("video/") && !((String) (obj1)).startsWith("audio/")) goto _L3; else goto _L4
_L8:
        if (i1 != 0) goto _L6; else goto _L5
_L5:
        throw new hev(((String) (obj1)), true);
        hfs1;
        obj1 = obj;
_L23:
        throw new hfa(hfs1, null);
        hfs1;
          goto _L7
_L3:
        i1 = 0;
          goto _L8
_L6:
        obj1 = hfs1.e();
        s = hfs1.f();
        s1 = hfs1.g();
        flag = hfs1.k();
        i1 = hfs1.j();
        if (!n) goto _L10; else goto _L9
_L9:
        hfs1 = "uploadmediapreferredbackground";
_L19:
        s2 = g.a(h, "plusi", hfs1, true, a);
        context = h;
        hiv1 = i;
        s3 = l;
        s4 = k;
        if (q != null) goto _L12; else goto _L11
_L11:
        hfs1 = o;
_L20:
        hfs1 = new heq(context, hiv1, s2, ((hfv) (obj)), ((String) (obj1)), s, s1, flag, i1, s3, s4, hfs1);
        a(((hfm) (hfs1)));
        i1 = hfs1.e();
        if (!a(i1)) goto _L14; else goto _L13
_L13:
        hfs1 = hfs1.c();
        if (hfs1 != null) goto _L16; else goto _L15
_L15:
        throw new hfc("upload failed (initial response didn't get valid location url)");
_L10:
        if (f == null) goto _L18; else goto _L17
_L17:
        hfs1 = f;
          goto _L19
_L12:
        hfs1 = q.a();
          goto _L20
_L16:
        hfs1 = a(((String) (hfs1)), ((hfv) (obj)), flag);
        try
        {
            if (((hfv) (obj)).b())
            {
                (new File(((hfv) (obj)).c().getPath())).delete();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        g = false;
        return hfs1;
_L14:
        if (i1 != 400)
        {
            break MISSING_BLOCK_LABEL_528;
        }
        throw new hfc((new StringBuilder(55)).append("upload failed (bad payload, file too large) ").append(i1).toString());
        if (i1 != 401)
        {
            break MISSING_BLOCK_LABEL_550;
        }
        throw new hfb(Integer.toString(401));
        if (i1 != 503) goto _L22; else goto _L21
_L21:
        throw new hfa("Server throttle code 503", (byte)0);
_L25:
        throw new hfa((new StringBuilder(34)).append("upload transient error:").append(i1).toString());
_L26:
        throw new hfc(Integer.toString(i1));
        hfs1;
        obj1 = s;
          goto _L23
        obj;
        hfs1 = null;
          goto _L24
_L4:
        i1 = 1;
          goto _L8
        hfs1;
        obj1 = obj;
          goto _L7
_L18:
        if (flag)
        {
            hfs1 = "uploadmediabackground";
        } else
        {
            hfs1 = "uploadmedia";
        }
          goto _L19
_L22:
        if (i1 != 0 && (i1 < 500 || i1 >= 600)) goto _L26; else goto _L25
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        g = true;
        if (e != null)
        {
            e.c();
            e = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void b()
    {
        p.a();
    }

    static 
    {
        Object obj = new Bundle();
        ((Bundle) (obj)).putString("uploadType", "resumable");
        a = ((Bundle) (obj));
        b = hpk.d.a(10L);
        obj = new HashSet(2);
        ((Set) (obj)).addAll(Arrays.asList(new String[] {
            "application/placeholder-image", "application/stitching-preview"
        }));
        c = Collections.unmodifiableSet(((Set) (obj)));
    }
}
