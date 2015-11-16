// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.util.Base64;
import com.google.api.client.http.HttpHeaders;
import java.util.List;

public final class hqj
{

    public final List a;

    public hqj(List list)
    {
        a = list;
    }

    private void a(gjc gjc1, HttpHeaders httpheaders)
    {
        httpheaders = httpheaders.getFirstHeaderStringValue("X-Goog-Safety-Encoding");
        if (httpheaders != null && TextUtils.equals(httpheaders, "base64"))
        {
            gjc1.a = Base64.decode(gjc1.a, 0);
        }
        a.add(gjc1);
    }

    private void b()
    {
        gjc gjc1 = new gjc();
        a.add(gjc1);
    }

    public void a()
    {
        b();
    }

    public volatile void a(Object obj, HttpHeaders httpheaders)
    {
        a((gjc)obj, httpheaders);
    }
}
