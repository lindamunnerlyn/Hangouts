// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;


// Referenced classes of package org.chromium.net:
//            CronetUrlRequest, UrlRequestListener

class b
    implements Runnable
{

    final tiveResponseInfo a;
    final String b;
    final CronetUrlRequest c;

    public void run()
    {
label0:
        {
            synchronized (CronetUrlRequest.a(c))
            {
                if (!c.d())
                {
                    break label0;
                }
            }
            return;
        }
        CronetUrlRequest.g(c);
        obj;
        JVM INSTR monitorexit ;
        try
        {
            CronetUrlRequest.e(c).a(a, b);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            CronetUrlRequest.a(c, ((Exception) (obj)));
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    tiveResponseInfo(CronetUrlRequest croneturlrequest, tiveResponseInfo tiveresponseinfo, String s)
    {
        c = croneturlrequest;
        a = tiveresponseinfo;
        b = s;
        super();
    }
}
