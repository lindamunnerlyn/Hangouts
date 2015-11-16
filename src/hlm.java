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

public final class hlm extends hla
{

    private static hll g = new hll();
    private String h;
    private Collection i;
    private PrivateKey j;
    private String k;
    private String l;

    public hlm()
    {
        this(new hln());
    }

    private hlm(hln hln1)
    {
        super(hln1);
        if (hln1.k == null)
        {
            boolean flag;
            if (hln1.i == null && hln1.j == null && hln1.m == null)
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
            h = (String)h.b(hln1.i);
            i = Collections.unmodifiableCollection(hln1.j);
            j = hln1.k;
            k = hln1.l;
            l = hln1.m;
            return;
        }
    }

    public hla a(hli hli)
    {
        return (hlm)super.a(hli);
    }

    public hla a(Long long1)
    {
        return (hlm)super.a(long1);
    }

    public hla a(String s)
    {
        return c(s);
    }

    protected hli a()
    {
        if (j == null)
        {
            return super.a();
        }
        Object obj3 = new hmh();
        ((hmh) (obj3)).b("RS256");
        ((hmh) (obj3)).a("JWT");
        ((hmh) (obj3)).c(k);
        Object obj = new hmk();
        long l1 = super.b.a();
        ((hmk) (obj)).a(h);
        ((hmk) (obj)).a(super.f);
        ((hmk) (obj)).b(Long.valueOf(l1 / 1000L));
        ((hmk) (obj)).a(Long.valueOf(l1 / 1000L + 3600L));
        ((hmk) (obj)).b(l);
        Object obj4 = new hns(new hml(" "));
        Object obj1 = i;
        obj4 = ((hns) (obj4)).a;
        obj1 = ((Iterable) (obj1)).iterator();
        ((hmk) (obj)).put("scope", ((hml) (obj4)).a(new StringBuilder(), ((java.util.Iterator) (obj1))).toString());
        try
        {
            Object obj2 = j;
            Object obj5 = super.e;
            obj3 = String.valueOf(hmo.b(((JsonFactory) (obj5)).toByteArray(obj3)));
            obj = String.valueOf(hmo.b(((JsonFactory) (obj5)).toByteArray(obj)));
            obj = (new StringBuilder(String.valueOf(obj3).length() + 1 + String.valueOf(obj).length())).append(((String) (obj3))).append(".").append(((String) (obj))).toString();
            byte abyte0[] = hog.a(((String) (obj)));
            obj5 = Signature.getInstance("SHA256withRSA");
            ((Signature) (obj5)).initSign(((PrivateKey) (obj2)));
            ((Signature) (obj5)).update(abyte0);
            obj2 = String.valueOf(hmo.b(((Signature) (obj5)).sign()));
            obj = (new StringBuilder(String.valueOf(obj).length() + 1 + String.valueOf(obj2).length())).append(((String) (obj))).append(".").append(((String) (obj2))).toString();
            obj2 = new hlf(super.c, super.e, new GenericUrl(super.f), "urn:ietf:params:oauth:grant-type:jwt-bearer");
            ((hlf) (obj2)).put("assertion", obj);
            obj = ((hlf) (obj2)).a();
        }
        catch (GeneralSecurityException generalsecurityexception)
        {
            IOException ioexception = new IOException();
            ioexception.initCause(generalsecurityexception);
            throw ioexception;
        }
        return ((hli) (obj));
    }

    public hla b(Long long1)
    {
        return (hlm)super.b(long1);
    }

    public hla b(String s)
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
        return (hlm)super.b(s);
    }

    public hlm c(String s)
    {
        return (hlm)super.a(s);
    }

}
