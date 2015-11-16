// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.HttpParams;

public class ado extends ThreadSafeClientConnManager
{

    private ado(HttpParams httpparams, SchemeRegistry schemeregistry)
    {
        super(httpparams, schemeregistry);
    }

    ado(HttpParams httpparams, SchemeRegistry schemeregistry, byte byte0)
    {
        this(httpparams, schemeregistry);
    }
}
