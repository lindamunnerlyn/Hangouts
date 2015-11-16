// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import com.google.api.client.http.AbstractInputStreamContent;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpResponseException;
import java.io.EOFException;
import java.io.IOException;

public abstract class cui extends ctr
{

    private static final long serialVersionUID = 1L;

    public cui()
    {
    }

    private cvn a(int i, cbr cbr, int j)
    {
        if (ebw.a("Babel_RequestWriter", 3))
        {
            String s = String.valueOf(getClass().getSimpleName());
            ebw.d("Babel_RequestWriter", (new StringBuilder(String.valueOf(s).length() + 41)).append("sendRequestProto ").append(s).append(" for account ").append(i).toString());
        }
        Object obj1 = h();
        m();
        ((GenericUrl) (obj1)).put("alt", "proto");
        Object obj;
        if (ctr.e)
        {
            obj = String.valueOf(((GenericUrl) (obj1)).toString());
            String s2;
            if (((String) (obj)).length() != 0)
            {
                obj = "sendRequestProto to ".concat(((String) (obj)));
            } else
            {
                obj = new String("sendRequestProto to ");
            }
            ebw.b("Babel_RequestWriter", ((String) (obj)));
        }
        try
        {
            obj = czr.a().a(((GenericUrl) (obj1)), this, i, cbr, i(), j);
        }
        // Misplaced declaration of an exception variable
        catch (cbr cbr)
        {
            obj = String.valueOf(obj1);
            obj1 = String.valueOf(cbr.getMessage());
            ebw.f("Babel_RequestWriter", (new StringBuilder(String.valueOf(obj).length() + 32 + String.valueOf(obj1).length())).append("Error making http request: url ").append(((String) (obj))).append(" ").append(((String) (obj1))).toString());
            if (cbr.getStatusCode() >= 400 && cbr.getStatusCode() < 500)
            {
                throw new dbo(104, cbr);
            } else
            {
                throw new dbo(105, cbr);
            }
        }
        // Misplaced declaration of an exception variable
        catch (cbr cbr)
        {
            obj = String.valueOf(obj1);
            ebw.f("Babel_RequestWriter", (new StringBuilder(String.valueOf(obj).length() + 50)).append("EOFException making http request (retryable): url ").append(((String) (obj))).toString());
            throw new dbo(103, cbr);
        }
        // Misplaced declaration of an exception variable
        catch (cbr cbr)
        {
            throw cbr;
        }
        // Misplaced declaration of an exception variable
        catch (cbr cbr)
        {
            obj = String.valueOf(obj1);
            ebw.d("Babel_RequestWriter", (new StringBuilder(String.valueOf(obj).length() + 31)).append("Error making http request: url ").append(((String) (obj))).toString(), cbr);
            throw new dbo(102, cbr);
        }
        if (obj != null)
        {
            i = ((cvn) (obj)).c.b;
            long l = ((cvn) (obj)).e;
            if (i != 1)
            {
                obj1 = String.valueOf(this);
                s2 = ((cvn) (obj)).c.a;
                if (((cvn) (obj)).c != null)
                {
                    cbr = ((cvn) (obj)).c.c;
                } else
                {
                    cbr = "(null)";
                }
                ebw.g("Babel", (new StringBuilder(String.valueOf(obj1).length() + 67 + String.valueOf(s2).length() + String.valueOf(cbr).length())).append("ServerRequest sent ").append(((String) (obj1))).append(" got responseStatus ").append(i).append(" desc ").append(s2).append(" debug_url ").append(cbr).toString());
            } else
            if (ctr.e)
            {
                String s1 = String.valueOf(this);
                String s3 = ((cvn) (obj)).c.a;
                if (((cvn) (obj)).c != null)
                {
                    cbr = ((cvn) (obj)).c.c;
                } else
                {
                    cbr = "(null)";
                }
                ebw.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 67 + String.valueOf(s3).length() + String.valueOf(cbr).length())).append("ServerRequest sent ").append(s1).append(" got responseStatus ").append(i).append(" desc ").append(s3).append(" debug_url ").append(cbr).toString());
            }
            switch (i)
            {
            default:
                if (((cvn) (obj)).c != null)
                {
                    cbr = ((cvn) (obj)).c.c;
                } else
                {
                    cbr = "(null)";
                }
                ebw.g("Babel_RequestWriter", (new StringBuilder(String.valueOf(cbr).length() + 71)).append("got unknown ResponseStatus in response header ").append(i).append("; debugUrl is ").append(cbr).toString());
                throw new dbo(108, l, "Resonse error: ERROR_UNEXPECTED");

            case 2: // '\002'
                throw new dbo(107, l, "Response error: ERROR_BUSY");

            case 3: // '\003'
                throw new dbo(108, l, "Response error: ERROR_UNEXPECTED");

            case 4: // '\004'
                throw new dbo(111, l, "Response error: ERROR_INVALID_REQUEST");

            case 5: // '\005'
                throw new dbo(109, l, "Response error: ERROR_RETRY_LIMIT");

            case 7: // '\007'
                throw new dbo(112, l, "Response error: ERROR_QUOTA_EXCEEDED");

            case 8: // '\b'
                throw new dbo(113, l, "Response error: ERROR_RESPONSE_NOT_FOUND");

            case 1: // '\001'
            case 6: // '\006'
            case 9: // '\t'
                return ((cvn) (obj));
            }
        } else
        {
            if (ebw.a("Babel_RequestWriter", 3))
            {
                ebw.d("Babel", "received null response");
            }
            return null;
        }
    }

    public cvn a(cci cci1)
    {
        cbr cbr;
        int i;
        int j;
        boolean flag;
        if (ctr.e)
        {
            Object obj = String.valueOf(cci1.toString());
            if (((String) (obj)).length() != 0)
            {
                obj = "[SEND] ".concat(((String) (obj)));
            } else
            {
                obj = new String("[SEND] ");
            }
            ebw.b("Babel_RequestWriter", ((String) (obj)));
        }
        j = cci1.c;
        obj = dbf.e(j);
        if (obj != null && ((ani) (obj)).q())
        {
            ebw.g("Babel_RequestWriter", (new StringBuilder(49)).append("[SEND] skipping for sms only account: ").append(j).toString());
            throw new dbo(138, "Cannot send request for SMS only account");
        }
        cbr = cbq.a(ctr.f);
        flag = k();
        i = 0;
_L3:
        if (i >= 2)
        {
            break MISSING_BLOCK_LABEL_287;
        }
        Object obj1 = a(cci1.g, cci1.d);
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        dbo dbo1;
        try
        {
            throw obj1;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            if (i == 0 && a(((dbo) (obj1))))
            {
                if (b(((dbo) (obj1))))
                {
                    flag = true;
                }
                if (this instanceof cut)
                {
                    obj1 = (cut)this;
                    h.a(j, SystemClock.elapsedRealtime(), 10, (new byy()).a(301).b(((cut) (obj1)).j).a(((cut) (obj1)).c));
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
            break MISSING_BLOCK_LABEL_249;
        }
        czr.a();
        czr.a(cbr, j);
        obj1 = a(j, cbr, cci1.e);
        dbo1 = b(cci1.g, cci1.d);
        if (dbo1 == null)
        {
            break MISSING_BLOCK_LABEL_283;
        }
        throw dbo1;
        return ((cvn) (obj1));
        return null;
    }

    public int o()
    {
        return 3;
    }

    public AbstractInputStreamContent p()
    {
        return null;
    }

    public int q()
    {
        return 0;
    }
}
