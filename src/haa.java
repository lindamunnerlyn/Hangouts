// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.chromium.net.HttpUrlRequest;

final class haa extends hav
{

    private final Context h;
    private final String i;
    private final hbe j;
    private final String k;
    private final String l;
    private final String m;
    private final boolean n;
    private final int o;
    private final String p;
    private final String q;
    private HttpUrlRequest r;
    private String s;
    private hba t;

    public haa(Context context, hdt hdt1, String s1, hbe hbe1, String s2, String s3, String s4, 
            boolean flag, int i1, String s5, String s6, hba hba)
    {
        super(hdt1);
        h = context;
        i = s1;
        j = hbe1;
        k = s2;
        l = s3;
        m = s4;
        n = flag;
        o = i1;
        p = s5;
        q = s6;
        t = hba;
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
        byte abyte0[];
        String s1;
        byte byte0;
        if (((String) (obj)).length() != 0)
        {
            obj = "sha1=".concat(((String) (obj)));
        } else
        {
            obj = new String("sha1=");
        }
        ((Map) (obj1)).put("X-Goog-Hash", obj);
        r = hbl.a(h, i, 3, ((Map) (obj1)), g);
        obj = new hto();
        hgx.a(h, hab);
        obj.a = hab.a(h, q, k, l, m, j, o, t);
        obj1 = h;
        s1 = p;
        if (n)
        {
            byte0 = 50;
        } else
        {
            byte0 = 100;
        }
        hek.a(((Context) (obj1)), ((kop) (obj)), s1, byte0);
        abyte0 = kop.toByteArray(((kop) (obj)));
        r.a("application/x-protobuf", abyte0);
        if (Log.isLoggable("MediaUploader", 2))
        {
            g.a(2, "MediaUploader", ((hto) (obj)).toString());
        }
    }

    protected void a(HttpUrlRequest httpurlrequest)
    {
        httpurlrequest = (new gzz(httpurlrequest.m())).a("Location");
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
