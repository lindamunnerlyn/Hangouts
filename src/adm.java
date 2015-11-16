// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.HttpParams;

public class adm extends ThreadSafeClientConnManager
{

    private adm(HttpParams httpparams, SchemeRegistry schemeregistry)
    {
        super(httpparams, schemeregistry);
    }

    adm(HttpParams httpparams, SchemeRegistry schemeregistry, byte byte0)
    {
        this(httpparams, schemeregistry);
    }

    public static adm a(HttpParams httpparams, SchemeRegistry schemeregistry, boolean flag)
    {
        if (flag)
        {
            return new ado(httpparams, schemeregistry);
        } else
        {
            return new adn(httpparams, schemeregistry);
        }
    }
}
