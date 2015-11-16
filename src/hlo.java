// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.util.Base64;
import com.google.api.client.http.HttpHeaders;
import java.util.List;

public final class hlo
{

    public final List a;

    public hlo(List list)
    {
        a = list;
    }

    private void a(ggc ggc1, HttpHeaders httpheaders)
    {
        httpheaders = httpheaders.getFirstHeaderStringValue("X-Goog-Safety-Encoding");
        if (httpheaders != null && TextUtils.equals(httpheaders, "base64"))
        {
            ggc1.a = Base64.decode(ggc1.a, 0);
        }
        a.add(ggc1);
    }

    private void b()
    {
        ggc ggc1 = new ggc();
        a.add(ggc1);
    }

    public void a()
    {
        b();
    }

    public volatile void a(Object obj, HttpHeaders httpheaders)
    {
        a((ggc)obj, httpheaders);
    }
}
