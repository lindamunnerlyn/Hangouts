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

public final class hap
{

    private static final Bundle a;
    private static final long b;
    private static final Set c;
    private static final Pattern d = Pattern.compile("bytes=(\\d+)-(\\d+)");
    private static final hat q = new haq();
    private hbd e;
    private String f;
    private final Context g;
    private final hee h;
    private final String i;
    private final String j;
    private final String k;
    private final hat l;
    private final boolean m;
    private final hba n;
    private final gzx o;
    private final hau p;

    hap(har har1)
    {
        g = har1.a;
        i = har1.b;
        j = har1.c;
        k = har1.d;
        l = har1.e;
        m = har1.f;
        n = har1.g;
        p = (hau)hgx.b(g, hau);
        o = har1.h;
        h = new hee(g, har1.b, "oauth2:https://www.googleapis.com/auth/plus.me https://www.googleapis.com/auth/plus.stream.read https://www.googleapis.com/auth/plus.stream.write https://www.googleapis.com/auth/plus.circles.write https://www.googleapis.com/auth/plus.circles.read https://www.googleapis.com/auth/plus.photos.readwrite https://www.googleapis.com/auth/plus.native");
    }

    private hao a(String s, hbe hbe1, boolean flag)
    {
        java.io.InputStream inputstream;
        l.a(0L, hbe1.k());
        if (Log.isLoggable("MediaUploader", 4))
        {
            int i1 = hbe1.hashCode();
            (new StringBuilder(28)).append("--- UPLOAD task: ").append(i1);
        }
        if (Log.isLoggable("MediaUploader", 2))
        {
            String s1 = String.valueOf("Uploading stream, resumeFingerprint: ");
            (new StringBuilder(String.valueOf(s1).length() + 50 + String.valueOf(null).length())).append(s1).append(null).append(", background: ").append(flag).append(", offset: 0)");
        }
        inputstream = hbe1.a(0L);
        Object obj;
        Object obj1;
        int k1;
        obj = new has(this, hbe1.g(), hbe1.k(), 0L);
        obj1 = new hbd(g, h, s, hbe1.e(), 0L, hbe1.k(), inputstream, flag, ((hbg) (obj)));
        e = ((hbd) (obj1));
        a(((hav) (obj1)));
        k1 = ((hbd) (obj1)).e();
        if (!a(k1))
        {
            break MISSING_BLOCK_LABEL_899;
        }
        ((has) (obj)).a(hbe1.k(), hbe1.k());
        if (Log.isLoggable("MediaUploader", 3))
        {
            int j1 = (int)((hav) (obj1)).f();
            (new StringBuilder(32)).append("parseResult: length: ").append(j1);
        }
        obj = ((hav) (obj1)).g();
        obj = kog.a(((byte []) (obj)), 0, obj.length);
        obj1 = new htp();
        ((htp) (obj1)).a(((kog) (obj)));
        obj1 = ((htp) (obj1)).a;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_342;
        }
        try
        {
            throw new hal("Unable to parse UploadMediaResponse");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        finally
        {
            e = null;
        }
        throw new haj(((IOException) (obj)).toString(), g.a(hbe1, s));
        h.a(inputstream);
        throw s;
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        if (((hui) (obj1)).d != null) goto _L3; else goto _L2
_L8:
        if (((hui) (obj1)).a == null) goto _L5; else goto _L4
_L4:
        hzt hzt1 = ((hui) (obj1)).a;
        if (hzt1.c == null) goto _L7; else goto _L6
_L6:
        obj1 = hzt1.c.a;
_L10:
        String s2;
        if (hzt1.q == null)
        {
            break MISSING_BLOCK_LABEL_893;
        }
        s2 = hzt1.q.i;
_L11:
        String s3 = hzt1.i;
        obj = new hao(((haz) (obj)), ((String) (obj1)), (long)(g.a(hzt1.u) * 1000D), hzt1.h, hbe1.k(), s2, s3);
_L9:
        hax.a();
        e = null;
        h.a(inputstream);
        return ((hao) (obj));
_L3:
        obj = ((hui) (obj1)).d;
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
            break MISSING_BLOCK_LABEL_579;
        }
        if (((hzy) (obj)).b != null)
        {
            l1 = ((hzy) (obj)).b.longValue() / 0x100000L;
        }
        if (((hzy) (obj)).a != null)
        {
            l2 = ((hzy) (obj)).a.longValue() / 0x100000L;
        }
        flag = g.a(((hzy) (obj)).d, false);
        flag2 = g.a(((hzy) (obj)).c, false);
        l3 = l2;
        l4 = l1;
        obj = new haz(l4, l3, flag, flag2);
          goto _L8
_L5:
        if (((hui) (obj1)).e == null)
        {
            break MISSING_BLOCK_LABEL_702;
        }
        s2 = null;
        hzt1 = null;
        khk khk1 = ((hui) (obj1)).e;
        obj1 = hzt1;
        String s4;
        if (khk1.b == null)
        {
            break MISSING_BLOCK_LABEL_677;
        }
        s4 = khk1.b.a;
        obj1 = hzt1;
        s2 = s4;
        if (khk1.b.b == null)
        {
            break MISSING_BLOCK_LABEL_677;
        }
        obj1 = khk1.b.b.c;
        s2 = s4;
        obj = new hao(((haz) (obj)), null, 0L, ((String) (obj1)), hbe1.k(), null, s2);
          goto _L9
        throw new hal("Unsupported UploadMediaResponse type");
        if (k1 == 308)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_729;
        }
        throw new hal("uploaded full stream but server returned incomplete");
        if (k1 != 400)
        {
            break MISSING_BLOCK_LABEL_768;
        }
        throw new hal((new StringBuilder(55)).append("upload failed (bad payload, file too large) ").append(k1).toString());
        if (k1 < 500 || k1 >= 600)
        {
            break MISSING_BLOCK_LABEL_820;
        }
        throw new haj((new StringBuilder(33)).append("upload transient error").append(k1).toString(), g.a(hbe1, s));
        if (((has) (obj)).a())
        {
            throw ((has) (obj)).b();
        }
        if (((hbd) (obj1)).h() != null || ((hbd) (obj1)).i())
        {
            throw new haj(((hbd) (obj1)).h(), g.a(hbe1, s));
        } else
        {
            throw new hal(Integer.toString(k1));
        }
_L2:
        obj = null;
          goto _L8
_L7:
        obj1 = null;
          goto _L10
        s2 = null;
          goto _L11
    }

    static hat a(hap hap1)
    {
        return hap1.l;
    }

    private hav a(hav hav1)
    {
        hav1.a();
        b();
        long l1 = SystemClock.elapsedRealtime();
        hav1.d();
        hax.a(SystemClock.elapsedRealtime() - l1);
        int i1 = hav1.e();
        if (i1 == 401 || i1 == 403)
        {
            long l2;
            try
            {
                hav1.j().a();
                hav1.a();
            }
            // Misplaced declaration of an exception variable
            catch (hav hav1)
            {
                throw new hak(hav1);
            }
            b();
            l2 = SystemClock.elapsedRealtime();
            hav1.d();
            hax.a(SystemClock.elapsedRealtime() - l2);
        }
        return hav1;
    }

    private static boolean a(int i1)
    {
        return i1 == 200 || i1 == 201;
    }

    static hat c()
    {
        return q;
    }

    static long d()
    {
        return b;
    }

    public hao a(hbb hbb1)
    {
        Object obj1;
        String s;
        obj1 = null;
        s = null;
        Object obj = new hbe(g, hbb1.a(), hbb1.b(), hbb1.d(), hbb1.l(), hbb1.m(), hbb1.n());
        if (!hbb1.i() && g.b(g, hbb1.a()))
        {
            ((hbe) (obj)).a();
        }
        if (!TextUtils.isEmpty(hbb1.c()))
        {
            ((hbe) (obj)).a(hbb1.c());
        }
        if (hbb1.h() > 0L)
        {
            ((hbe) (obj)).b(hbb1.h());
        }
        obj1 = ((hbe) (obj)).e();
        if (c.contains(obj1))
        {
            throw new hae(((String) (obj1)), false);
        }
          goto _L1
        obj1;
        hbb1 = ((hbb) (obj));
        obj = obj1;
_L28:
        throw new hag(((Throwable) (obj)));
        obj;
        obj1 = hbb1;
        hbb1 = ((hbb) (obj));
_L7:
        int i1;
        boolean flag;
        String s1;
        String s2;
        Context context;
        hee hee1;
        String s3;
        String s4;
        if (obj1 != null)
        {
            try
            {
                if (((hbe) (obj1)).b())
                {
                    (new File(((hbe) (obj1)).c().getPath())).delete();
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw hbb1;
_L1:
        if (obj1 == null) goto _L3; else goto _L2
_L2:
        if (!((String) (obj1)).startsWith("image/") && !((String) (obj1)).startsWith("video/")) goto _L3; else goto _L4
_L8:
        if (i1 != 0) goto _L6; else goto _L5
_L5:
        throw new hae(((String) (obj1)), true);
        hbb1;
        obj1 = obj;
_L27:
        throw new haj(hbb1, null);
        hbb1;
          goto _L7
_L3:
        i1 = 0;
          goto _L8
_L6:
        obj1 = hbb1.e();
        s = hbb1.f();
        s1 = hbb1.g();
        flag = hbb1.k();
        i1 = hbb1.j();
        if (!m) goto _L10; else goto _L9
_L9:
        hbb1 = "uploadmediapreferredbackground";
_L19:
        s2 = g.a(g, "plusi", hbb1, true, a);
        context = g;
        hee1 = h;
        s3 = k;
        s4 = j;
        if (p != null) goto _L12; else goto _L11
_L11:
        hbb1 = n;
_L20:
        hbb1 = new haa(context, hee1, s2, ((hbe) (obj)), ((String) (obj1)), s, s1, flag, i1, s3, s4, hbb1);
        a(((hav) (hbb1)));
        i1 = hbb1.e();
        if (!a(i1)) goto _L14; else goto _L13
_L13:
        hbb1 = hbb1.c();
        if (hbb1 != null) goto _L16; else goto _L15
_L15:
        throw new hal("upload failed (initial response didn't get valid location url)");
_L10:
        if (f == null) goto _L18; else goto _L17
_L17:
        hbb1 = f;
          goto _L19
_L12:
        hbb1 = p.a();
          goto _L20
_L16:
        hbb1 = a(((String) (hbb1)), ((hbe) (obj)), flag);
        try
        {
            if (((hbe) (obj)).b())
            {
                (new File(((hbe) (obj)).c().getPath())).delete();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return hbb1;
        }
        return hbb1;
_L14:
        if (i1 != 400)
        {
            break MISSING_BLOCK_LABEL_508;
        }
        throw new hal((new StringBuilder(55)).append("upload failed (bad payload, file too large) ").append(i1).toString());
        if (i1 != 401) goto _L22; else goto _L21
_L21:
        throw new hak(Integer.toString(401));
_L29:
        if (i1 != 503) goto _L24; else goto _L23
_L23:
        hbb1 = new haj("Server throttle code 503", (byte)0);
_L26:
        throw hbb1;
_L24:
        hbb1 = new haj((new StringBuilder(34)).append("upload transient error:").append(i1).toString());
        if (true) goto _L26; else goto _L25
_L25:
        throw new hal(Integer.toString(i1));
        hbb1;
        obj1 = s;
          goto _L27
        obj;
        hbb1 = null;
          goto _L28
_L4:
        i1 = 1;
          goto _L8
        hbb1;
        obj1 = obj;
          goto _L7
_L18:
        if (flag)
        {
            hbb1 = "uploadmediabackground";
        } else
        {
            hbb1 = "uploadmedia";
        }
          goto _L19
_L22:
        if (i1 != 0 && (i1 < 500 || i1 >= 600)) goto _L25; else goto _L29
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
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
        o.a();
    }

    static 
    {
        Object obj = new Bundle();
        ((Bundle) (obj)).putString("uploadType", "resumable");
        a = ((Bundle) (obj));
        b = hkp.d.a(10L);
        obj = new HashSet(2);
        ((Set) (obj)).addAll(Arrays.asList(new String[] {
            "application/placeholder-image", "application/stitching-preview"
        }));
        c = Collections.unmodifiableSet(((Set) (obj)));
    }
}
