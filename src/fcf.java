// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.http.params.AbstractHttpParams;
import org.apache.http.params.HttpParams;

final class fcf extends AbstractHttpParams
{

    final fce a;

    fcf(fce fce1)
    {
        a = fce1;
        super();
    }

    public HttpParams copy()
    {
        throw new UnsupportedOperationException();
    }

    public Object getParameter(String s)
    {
        return null;
    }

    public boolean removeParameter(String s)
    {
        return true;
    }

    public HttpParams setParameter(String s, Object obj)
    {
        if (!s.equals("http.conn-manager.timeout"))
        {
            if (s.equals("http.socket.timeout"))
            {
                s = (Integer)obj;
                a.a.a = s.intValue();
            } else
            if (s.equals("http.connection.timeout"))
            {
                s = (Integer)obj;
                a.a.b = s.intValue();
                return this;
            }
        }
        return this;
    }
}
