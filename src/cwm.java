// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.SystemClock;
import com.google.api.client.http.AbstractInputStreamContent;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpResponseException;
import java.io.EOFException;
import java.io.IOException;

public abstract class cwm extends cvv
{

    private static final long serialVersionUID = 1L;

    public cwm()
    {
    }

    private cxr a(Context context, int i, ccw ccw1, int j)
    {
        if (eev.a("Babel_RequestWriter", 3))
        {
            String s = String.valueOf(getClass().getSimpleName());
            eev.d("Babel_RequestWriter", (new StringBuilder(String.valueOf(s).length() + 41)).append("sendRequestProto ").append(s).append(" for account ").append(i).toString());
        }
        Object obj = b(context);
        l();
        ((GenericUrl) (obj)).put("alt", "proto");
        if (cvv.e)
        {
            context = String.valueOf(((GenericUrl) (obj)).toString());
            String s2;
            if (context.length() != 0)
            {
                context = "sendRequestProto to ".concat(context);
            } else
            {
                context = new String("sendRequestProto to ");
            }
            eev.b("Babel_RequestWriter", context);
        }
        try
        {
            context = dax.a();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            ccw1 = String.valueOf(obj);
            obj = String.valueOf(context.getMessage());
            eev.f("Babel_RequestWriter", (new StringBuilder(String.valueOf(ccw1).length() + 32 + String.valueOf(obj).length())).append("Error making http request: url ").append(ccw1).append(" ").append(((String) (obj))).toString());
            if (context.getStatusCode() >= 400 && context.getStatusCode() < 500)
            {
                throw new dcx(104, context);
            } else
            {
                throw new dcx(105, context);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            ccw1 = String.valueOf(obj);
            eev.f("Babel_RequestWriter", (new StringBuilder(String.valueOf(ccw1).length() + 50)).append("EOFException making http request (retryable): url ").append(ccw1).toString());
            throw new dcx(103, context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            ccw1 = String.valueOf(obj);
            eev.d("Babel_RequestWriter", (new StringBuilder(String.valueOf(ccw1).length() + 31)).append("Error making http request: url ").append(ccw1).toString(), context);
            throw new dcx(102, context);
        }
        if (ccw1 != null)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        eev.e("Babel_RequestWriter", "no auth data.");
        ccw1 = context.a(((GenericUrl) (obj)), this, i, ccw1, h(), j);
        if (ccw1 != null)
        {
            i = ((cxr) (ccw1)).c.b;
            long l = ((cxr) (ccw1)).e;
            if (i != 1)
            {
                obj = String.valueOf(this);
                s2 = ((cxr) (ccw1)).c.a;
                if (((cxr) (ccw1)).c != null)
                {
                    context = ((cxr) (ccw1)).c.c;
                } else
                {
                    context = "(null)";
                }
                eev.g("Babel", (new StringBuilder(String.valueOf(obj).length() + 67 + String.valueOf(s2).length() + String.valueOf(context).length())).append("ServerRequest sent ").append(((String) (obj))).append(" got responseStatus ").append(i).append(" desc ").append(s2).append(" debug_url ").append(context).toString());
            } else
            if (cvv.e)
            {
                String s1 = String.valueOf(this);
                String s3 = ((cxr) (ccw1)).c.a;
                if (((cxr) (ccw1)).c != null)
                {
                    context = ((cxr) (ccw1)).c.c;
                } else
                {
                    context = "(null)";
                }
                eev.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 67 + String.valueOf(s3).length() + String.valueOf(context).length())).append("ServerRequest sent ").append(s1).append(" got responseStatus ").append(i).append(" desc ").append(s3).append(" debug_url ").append(context).toString());
            }
            switch (i)
            {
            default:
                if (((cxr) (ccw1)).c != null)
                {
                    context = ((cxr) (ccw1)).c.c;
                } else
                {
                    context = "(null)";
                }
                eev.g("Babel_RequestWriter", (new StringBuilder(String.valueOf(context).length() + 71)).append("got unknown ResponseStatus in response header ").append(i).append("; debugUrl is ").append(context).toString());
                throw new dcx(108, l, "Resonse error: ERROR_UNEXPECTED");

            case 2: // '\002'
                throw new dcx(107, l, "Response error: ERROR_BUSY");

            case 3: // '\003'
                throw new dcx(108, l, "Response error: ERROR_UNEXPECTED");

            case 4: // '\004'
                throw new dcx(111, l, "Response error: ERROR_INVALID_REQUEST");

            case 5: // '\005'
                throw new dcx(109, l, "Response error: ERROR_RETRY_LIMIT");

            case 7: // '\007'
                throw new dcx(112, l, "Response error: ERROR_QUOTA_EXCEEDED");

            case 8: // '\b'
                throw new dcx(113, l, "Response error: ERROR_RESPONSE_NOT_FOUND");

            case 1: // '\001'
            case 6: // '\006'
            case 9: // '\t'
                return ccw1;
            }
        } else
        {
            if (eev.a("Babel_RequestWriter", 3))
            {
                eev.d("Babel", "received null response");
            }
            return null;
        }
    }

    public cxr a(Context context, cdn cdn1)
    {
        ccw ccw1;
        int i;
        int j;
        boolean flag;
        if (cvv.e)
        {
            Object obj = String.valueOf(cdn1.toString());
            if (((String) (obj)).length() != 0)
            {
                obj = "[SEND] ".concat(((String) (obj)));
            } else
            {
                obj = new String("[SEND] ");
            }
            eev.b("Babel_RequestWriter", ((String) (obj)));
        }
        j = cdn1.c;
        obj = dcn.e(j);
        if (obj != null && ((aoa) (obj)).o())
        {
            eev.g("Babel_RequestWriter", (new StringBuilder(49)).append("[SEND] skipping for sms only account: ").append(j).toString());
            throw new dcx(138, "Cannot send request for SMS only account");
        }
        ccw1 = ccv.a(cvv.f);
        flag = j();
        i = 0;
_L3:
        if (i >= 2)
        {
            break MISSING_BLOCK_LABEL_312;
        }
        Object obj1 = a(cdn1.g, cdn1.d);
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        dcx dcx1;
        try
        {
            throw obj1;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            if (a(context, i, ((dcx) (obj1))))
            {
                if (a(((dcx) (obj1))))
                {
                    flag = true;
                }
                if (this instanceof cwx)
                {
                    obj1 = (cwx)this;
                    h.a(j, SystemClock.elapsedRealtime(), 10, (new cab()).a(301).b(((cwx) (obj1)).j).a(((cwx) (obj1)).c));
                }
                i++;
            } else
            {
                throw obj1;
            }
        }
        if (true) goto _L3; else goto _L2
_L2:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_255;
        }
        dax.a();
        ccw1.d(dcn.e(j).a());
        if (a(context, i))
        {
            obj1 = null;
        } else
        {
            obj1 = ccw1;
        }
        obj1 = a(context, j, ((ccw) (obj1)), cdn1.e);
        dcx1 = b(cdn1.g, cdn1.d);
        if (dcx1 == null)
        {
            break MISSING_BLOCK_LABEL_308;
        }
        throw dcx1;
        return ((cxr) (obj1));
        return null;
    }

    public boolean a(Context context, int i)
    {
        return false;
    }

    public int n()
    {
        return 3;
    }

    public AbstractInputStreamContent o()
    {
        return null;
    }

    public int p()
    {
        return 0;
    }
}
