// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.api.client.http.GenericUrl;
import com.google.api.client.json.JsonFactory;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.security.Signature;
import java.util.Collection;
import java.util.Collections;

public final class hqh extends hpv
{

    private static hqg g = new hqg();
    private String h;
    private Collection i;
    private PrivateKey j;
    private String k;
    private String l;

    public hqh()
    {
        this(new hqi());
    }

    private hqh(hqi hqi1)
    {
        super(hqi1);
        if (hqi1.k == null)
        {
            boolean flag;
            if (hqi1.i == null && hqi1.j == null && hqi1.m == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            l.a(flag);
            return;
        } else
        {
            h = (String)h.a(hqi1.i);
            i = Collections.unmodifiableCollection(hqi1.j);
            j = hqi1.k;
            k = hqi1.l;
            l = hqi1.m;
            return;
        }
    }

    public hpv a(hqd hqd)
    {
        return (hqh)super.a(hqd);
    }

    public hpv a(Long long1)
    {
        return (hqh)super.a(long1);
    }

    public hpv a(String s)
    {
        return c(s);
    }

    protected hqd a()
    {
        if (j == null)
        {
            return super.a();
        }
        Object obj3 = new hrc();
        ((hrc) (obj3)).b("RS256");
        ((hrc) (obj3)).a("JWT");
        ((hrc) (obj3)).c(k);
        Object obj = new hrf();
        long l1 = super.b.a();
        ((hrf) (obj)).a(h);
        ((hrf) (obj)).a(super.f);
        ((hrf) (obj)).b(Long.valueOf(l1 / 1000L));
        ((hrf) (obj)).a(Long.valueOf(l1 / 1000L + 3600L));
        ((hrf) (obj)).b(l);
        Object obj4 = new hso(new hrg(" "));
        Object obj1 = i;
        obj4 = ((hso) (obj4)).a;
        obj1 = ((Iterable) (obj1)).iterator();
        ((hrf) (obj)).put("scope", ((hrg) (obj4)).a(new StringBuilder(), ((java.util.Iterator) (obj1))).toString());
        try
        {
            Object obj2 = j;
            Object obj5 = super.e;
            obj3 = String.valueOf(hrk.b(((JsonFactory) (obj5)).toByteArray(obj3)));
            obj = String.valueOf(hrk.b(((JsonFactory) (obj5)).toByteArray(obj)));
            obj = (new StringBuilder(String.valueOf(obj3).length() + 1 + String.valueOf(obj).length())).append(((String) (obj3))).append(".").append(((String) (obj))).toString();
            byte abyte0[] = htc.a(((String) (obj)));
            obj5 = Signature.getInstance("SHA256withRSA");
            ((Signature) (obj5)).initSign(((PrivateKey) (obj2)));
            ((Signature) (obj5)).update(abyte0);
            obj2 = String.valueOf(hrk.b(((Signature) (obj5)).sign()));
            obj = (new StringBuilder(String.valueOf(obj).length() + 1 + String.valueOf(obj2).length())).append(((String) (obj))).append(".").append(((String) (obj2))).toString();
            obj2 = new hqa(super.c, super.e, new GenericUrl(super.f), "urn:ietf:params:oauth:grant-type:jwt-bearer");
            ((hqa) (obj2)).put("assertion", obj);
            obj = ((hqa) (obj2)).a();
        }
        catch (GeneralSecurityException generalsecurityexception)
        {
            IOException ioexception = new IOException();
            ioexception.initCause(generalsecurityexception);
            throw ioexception;
        }
        return ((hqd) (obj));
    }

    public hpv b(Long long1)
    {
        return (hqh)super.b(long1);
    }

    public hpv b(String s)
    {
        if (s != null)
        {
            boolean flag;
            if (super.e != null && super.c != null && super.d != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            l.a(flag, "Please use the Builder and call setJsonFactory, setTransport and setClientSecrets");
        }
        return (hqh)super.b(s);
    }

    public hqh c(String s)
    {
        return (hqh)super.a(s);
    }

}
