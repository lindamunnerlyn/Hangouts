// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import aoa;
import cgd;
import clp;
import clq;
import dcn;
import eev;
import g;
import gqv;
import gqw;
import hbd;
import hbo;
import hbu;
import hmo;
import java.util.Iterator;
import java.util.List;
import l;

// Referenced classes of package com.google.android.apps.hangouts.phone:
//            BabelGatewayActivity

public class ConversationUrlHandlerActivity extends hmo
    implements gqw
{

    private String j;
    private String m;
    private String n;
    private boolean o;
    private String p;
    private String q;
    private hbd r;

    public ConversationUrlHandlerActivity()
    {
        r = (new hbd(this, l)).a("active-hangouts-account").a(k).b(this);
    }

    private void a(Uri uri)
    {
        boolean flag2 = false;
        Object obj = uri.getQueryParameter("rpi");
        String s = uri.getQueryParameter("id");
        String s2 = uri.getQueryParameter("draft");
        if (s != null)
        {
            m = s;
        }
        if (obj != null)
        {
            j = ((String) (obj));
        }
        if (s2 != null)
        {
            q = s2;
        }
        obj = uri.getQueryParameters("pi");
        boolean flag1;
        if (!((List) (obj)).isEmpty())
        {
            obj = ((List) (obj)).iterator();
            boolean flag = false;
            do
            {
                flag1 = flag;
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                String s1 = (String)((Iterator) (obj)).next();
                if (n != null)
                {
                    String s3 = n;
                    n = (new StringBuilder(String.valueOf(s3).length() + 1 + String.valueOf(s1).length())).append(s3).append("|").append(s1).toString();
                    flag = true;
                } else
                {
                    n = s1;
                }
            } while (true);
        } else
        {
            flag1 = false;
        }
        if (flag1 || TextUtils.equals(uri.getQueryParameter("group"), "1"))
        {
            flag2 = true;
        }
        o = flag2;
    }

    private void b(int i)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setMessage(i);
        builder.setPositiveButton(l.hd, new clp(this));
        builder.setOnCancelListener(new clq(this));
        builder.show();
    }

    public void a(boolean flag, gqv gqv1, gqv gqv2, int i, int k)
    {
        if (gqv2 == gqv.c)
        {
            if (!TextUtils.isEmpty(m))
            {
                gqv1 = BabelGatewayActivity.a(k, m, null);
            } else
            {
                if (p != null && p.contains("key"))
                {
                    g.a(dcn.e(k), 1868);
                }
                gqv1 = BabelGatewayActivity.a(k, n, null, q, o, p);
            }
            gqv1.putExtra("account_id", k);
            startActivity(gqv1);
            finish();
            return;
        } else
        {
            finish();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        Object obj;
        super.onCreate(bundle);
        obj = getIntent().getData();
        if (obj != null) goto _L2; else goto _L1
_L1:
        eev.f("Babel", "Invalid uri for conversation Url");
_L7:
        boolean flag = false;
_L8:
        if (!flag)
        {
            b(l.ap);
            return;
        }
        break MISSING_BLOCK_LABEL_615;
_L2:
        String s = ((Uri) (obj)).getQueryParameter("path");
        if (obj == null) goto _L4; else goto _L3
_L3:
        bundle = ((Uri) (obj)).getPathSegments();
        if (!((Uri) (obj)).getHost().equalsIgnoreCase("plus.google.com") || bundle.size() != 3 || !((String)bundle.get(0)).equalsIgnoreCase("hangouts") || !((String)bundle.get(1)).equalsIgnoreCase("app") || !((String)bundle.get(2)).equalsIgnoreCase("emlink")) goto _L4; else goto _L5
_L5:
        flag = true;
_L9:
        bundle = ((Bundle) (obj));
        if (flag)
        {
            bundle = ((Bundle) (obj));
            if (!s.isEmpty())
            {
                bundle = String.valueOf("https://plus.google.com");
                obj = String.valueOf(s);
                if (((String) (obj)).length() != 0)
                {
                    bundle = bundle.concat(((String) (obj)));
                } else
                {
                    bundle = new String(bundle);
                }
                bundle = Uri.parse(bundle);
            }
        }
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_609;
        }
        obj = bundle.getPathSegments();
        s = bundle.getHost();
        if (s.equalsIgnoreCase("plus.google.com") && ((List) (obj)).size() == 3 && ((String)((List) (obj)).get(0)).equalsIgnoreCase("hangouts") && ((String)((List) (obj)).get(1)).equalsIgnoreCase("app") && ((String)((List) (obj)).get(2)).equalsIgnoreCase("conversation"))
        {
            flag = true;
        } else
        if (s.equalsIgnoreCase("hangouts.google.com") && ((List) (obj)).size() == 1 && ((String)((List) (obj)).get(0)).equalsIgnoreCase("chat"))
        {
            flag = true;
        } else
        if (s.equalsIgnoreCase("hangouts.google.com") && ((List) (obj)).size() == 2 && ((String)((List) (obj)).get(0)).equalsIgnoreCase("chat"))
        {
            flag = true;
        } else
        {
            if (!s.equalsIgnoreCase("hangouts.google.com") || ((List) (obj)).size() != 3 || !((String)((List) (obj)).get(0)).equalsIgnoreCase("chat") || !((String)((List) (obj)).get(1)).equalsIgnoreCase("person"))
            {
                break MISSING_BLOCK_LABEL_609;
            }
            flag = true;
        }
_L10:
        if (!flag) goto _L7; else goto _L6
_L6:
        a(bundle);
        obj = bundle.getPathSegments();
        if (bundle.getHost().equalsIgnoreCase("hangouts.google.com") && ((List) (obj)).size() == 2 && ((String)((List) (obj)).get(0)).equalsIgnoreCase("chat"))
        {
            m = (String)((List) (obj)).get(1);
        }
        if (bundle.getHost().equalsIgnoreCase("hangouts.google.com") && ((List) (obj)).size() == 3 && ((String)((List) (obj)).get(0)).equalsIgnoreCase("chat") && ((String)((List) (obj)).get(1)).equalsIgnoreCase("person"))
        {
            n = (String)((List) (obj)).get(2);
        }
        p = bundle.toString();
        flag = true;
          goto _L8
_L4:
        flag = false;
          goto _L9
        flag = false;
          goto _L10
        if (!TextUtils.isEmpty(j))
        {
            bundle = dcn.a(cgd.a(j));
            if (bundle == null)
            {
                b(l.ao);
                return;
            }
            bundle = bundle.a();
        } else
        {
            bundle = dcn.c(false);
            if (bundle.length == 0)
            {
                startActivity(g.d(null));
                finish();
                bundle = null;
            } else
            if (bundle.length == 1)
            {
                bundle = dcn.e(bundle[0]).a();
            } else
            {
                bundle = null;
            }
        }
        bundle = (new hbo()).b().a(bundle).a(hbu);
        r.a(bundle);
        return;
          goto _L8
    }
}
