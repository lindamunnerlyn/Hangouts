// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.chromium.net.HttpUrlRequest;

final class heq extends hfm
{

    private final Context h;
    private final String i;
    private final hfv j;
    private final String k;
    private final String l;
    private final String m;
    private final boolean n;
    private final int o;
    private final String p;
    private final String q;
    private HttpUrlRequest r;
    private String s;
    private hfr t;

    public heq(Context context, hik hik1, String s1, hfv hfv1, String s2, String s3, String s4, 
            boolean flag, int i1, String s5, String s6, hfr hfr1)
    {
        super(hik1);
        h = context;
        i = s1;
        j = hfv1;
        k = s2;
        l = s3;
        m = s4;
        n = flag;
        o = i1;
        p = s5;
        q = s6;
        t = hfr1;
    }

    public void a()
    {
        Object obj1 = new HashMap(j().a(i));
        ((Map) (obj1)).put("X-Upload-Content-Type", j.e());
        long l1 = j.k();
        if (l1 >= 0L)
        {
            ((Map) (obj1)).put("X-Upload-Content-Length", Long.toString(l1));
        }
        Object obj = String.valueOf(Base64.encodeToString(j.i().c(), 2));
        Object obj2;
        Context context;
        hfv hfv1;
        String s1;
        String s2;
        String s3;
        hfr hfr1;
        String s4;
        byte byte0;
        int i1;
        if (((String) (obj)).length() != 0)
        {
            obj = "sha1=".concat(((String) (obj)));
        } else
        {
            obj = new String("sha1=");
        }
        ((Map) (obj1)).put("X-Goog-Hash", obj);
        r = hgc.a(h, i, 3, ((Map) (obj1)), g);
        obj1 = new hys();
        hlp.a(h, her);
        context = h;
        s1 = q;
        s2 = k;
        obj = l;
        s3 = m;
        hfv1 = j;
        i1 = o;
        hfr1 = t;
        obj2 = new hzl();
        s4 = hfv1.h().a();
        obj2.a = s1;
        obj2.b = s2;
        obj2.l = s3;
        obj2.w = s4;
        if (hfr1 != hfr.d)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        if (byte0 != 0)
        {
            obj2.F = her.a(hfr1);
            boolean flag;
            if (hfr1 == hfr.a)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj2.g = Boolean.valueOf(flag);
        } else
        {
            obj2.g = Boolean.valueOf(hfv1.b());
        }
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj = hem.a(s4);
        }
        obj2.k = ((String) (obj));
        obj2.z = (new String[] {
            obj
        });
        obj = hfv1.j();
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj2.B = ((String) (obj));
        }
        obj2.y = new hzw();
        ((hzl) (obj2)).y.a = Integer.valueOf(i1);
        obj2.q = Long.valueOf(hfv1.f() / 1000L);
        if (hfv1.l() != null)
        {
            obj2.u = new hzg();
            ((hzl) (obj2)).u.b = new hzv();
            ((hzl) (obj2)).u.b.a = hfv1.l();
        } else
        if (g.d(context, hfv1.g()))
        {
            obj2.u = new hzg();
            ((hzl) (obj2)).u.b = new hzv();
            ((hzl) (obj2)).u.b.a = new kec();
            ((hzl) (obj2)).u.b.a.b = 8;
        }
        if (hfv1.m() != null)
        {
            obj2.v = new hzh();
            ((hzl) (obj2)).v.a = hfv1.m();
        }
        obj2.h = hfv1.d();
        obj = hfv1.n();
        if (obj != null)
        {
            obj2.E = ((hzx) (obj));
            obj2.w = null;
            obj2.z = null;
            obj2.F = her.a(hfr.c);
            obj2.C = 3;
            obj2.g = null;
            obj2.k = null;
            obj2.r = null;
            obj2.h = null;
            obj2.v = null;
            obj2.s = null;
            obj2.q = null;
            obj2.y = null;
            obj2.D = new kpo();
        }
        obj1.a = ((hzl) (obj2));
        obj = h;
        obj2 = p;
        if (n)
        {
            byte0 = 50;
        } else
        {
            byte0 = 100;
        }
        hjb.a(((Context) (obj)), ((kws) (obj1)), ((String) (obj2)), byte0);
        obj = kws.toByteArray(((kws) (obj1)));
        r.a("application/x-protobuf", ((byte []) (obj)));
        if (Log.isLoggable("MediaUploader", 2))
        {
            g.a(2, "MediaUploader", ((hys) (obj1)).toString());
        }
    }

    protected void a(HttpUrlRequest httpurlrequest)
    {
        httpurlrequest = (new hep(httpurlrequest.m())).a("Location");
        if (httpurlrequest == null || httpurlrequest.size() != 1)
        {
            return;
        } else
        {
            s = (String)httpurlrequest.get(0);
            return;
        }
    }

    protected HttpUrlRequest b()
    {
        return r;
    }

    public String c()
    {
        return s;
    }
}
