// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.params.HttpParams;

final class ado extends adm
{

    public ado(HttpParams httpparams, SchemeRegistry schemeregistry)
    {
        super(httpparams, schemeregistry, (byte)0);
    }

    protected ClientConnectionOperator createConnectionOperator(SchemeRegistry schemeregistry)
    {
        return new adg(schemeregistry, true);
    }
}
