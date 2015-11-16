// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.X509TrustManager;

public final class lnd
    implements lne
{

    private final X509TrustManager a;

    public lnd(X509TrustManager x509trustmanager)
    {
        a = x509trustmanager;
    }

    public List a(X509Certificate ax509certificate[], String s, String s1)
    {
        a.checkServerTrusted(ax509certificate, s);
        return Collections.emptyList();
    }
}
