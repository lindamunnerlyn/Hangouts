// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import ani;
import cey;
import ckk;
import ckl;
import dbf;
import ebw;
import g;
import gmp;
import gmq;
import gwt;
import gxe;
import gxj;
import hhw;
import java.util.Iterator;
import java.util.List;
import l;

// Referenced classes of package com.google.android.apps.hangouts.phone:
//            BabelGatewayActivity

public class ConversationUrlHandlerActivity extends hhw
    implements gmq
{

    private String j;
    private String m;
    private String n;
    private boolean o;
    private String p;
    private String q;
    private gwt r;

    public ConversationUrlHandlerActivity()
    {
        r = (new gwt(this, l)).a("active-hangouts-account").a(k).b(this);
    }

    private void a(Uri uri)
    {
        j = uri.getQueryParameter("rpi");
        m = uri.getQueryParameter("id");
        q = uri.getQueryParameter("draft");
        n = null;
        o = false;
        Iterator iterator = uri.getQueryParameters("pi").iterator();
        boolean flag = false;
        while (iterator.hasNext()) 
        {
            String s = (String)iterator.next();
            if (n != null)
            {
                String s1 = n;
                n = (new StringBuilder(String.valueOf(s1).length() + 1 + String.valueOf(s).length())).append(s1).append("|").append(s).toString();
                flag = true;
            } else
            {
                n = s;
            }
        }
        if (flag)
        {
            o = true;
            return;
        } else
        {
            o = TextUtils.equals(uri.getQueryParameter("group"), "1");
            return;
        }
    }

    private void b(int i)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setMessage(i);
        builder.setPositiveButton(l.hJ, new ckk(this));
        builder.setOnCancelListener(new ckl(this));
        builder.show();
    }

    private static boolean b(Uri uri)
    {
        if (uri == null)
        {
            return false;
        }
        uri = uri.getPathSegments();
        return uri.size() == 3 && ((String)uri.get(0)).equalsIgnoreCase("hangouts") && ((String)uri.get(1)).equalsIgnoreCase("app") && ((String)uri.get(2)).equalsIgnoreCase("conversation");
    }

    public void a(boolean flag, gmp gmp1, gmp gmp2, int i, int k)
    {
        if (gmp2 == gmp.c)
        {
            if (!TextUtils.isEmpty(m))
            {
                gmp1 = BabelGatewayActivity.a(k, m, null);
            } else
            {
                g.a(dbf.e(k), 1868);
                gmp1 = BabelGatewayActivity.a(k, n, null, q, o, p);
            }
            gmp1.putExtra("account_id", k);
            startActivity(gmp1);
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
        boolean flag;
        super.onCreate(bundle);
        bundle = getIntent().getData();
        List list;
        if (bundle == null)
        {
            ebw.f("Babel", "Invalid uri for conversation Url");
            flag = false;
        } else
        {
            String s = bundle.getQueryParameter("path");
            if (TextUtils.isEmpty(s))
            {
                ebw.f("Babel", "Path is empty for conversation Url");
                flag = false;
            } else
            {
                bundle = String.valueOf("https://plus.google.com");
                s = String.valueOf(s);
                if (s.length() != 0)
                {
                    bundle = bundle.concat(s);
                } else
                {
                    bundle = new String(bundle);
                }
                bundle = Uri.parse(bundle);
                if (!b(bundle))
                {
                    ebw.f("Babel", String.format("Invalid path for conversation Url: %s", new Object[] {
                        bundle.getPath()
                    }));
                    flag = false;
                } else
                {
                    a(bundle);
                    if (TextUtils.isEmpty(m) == TextUtils.isEmpty(n))
                    {
                        ebw.f("Babel", "Exactly one of conversationId and inviteeGaiaIds should be provided.");
                        flag = false;
                    } else
                    {
                        flag = true;
                    }
                }
            }
        }
        if (flag) goto _L2; else goto _L1
_L1:
        bundle = getIntent().getData();
        if (bundle == null) goto _L4; else goto _L3
_L3:
        if (!bundle.getHost().equalsIgnoreCase("hangouts.google.com")) goto _L6; else goto _L5
_L5:
        list = bundle.getPathSegments();
        if (list.size() != 1 || !((String)list.get(0)).equalsIgnoreCase("chat")) goto _L4; else goto _L7
_L7:
        a(bundle);
        p = bundle.toString();
        flag = true;
_L8:
        if (!flag)
        {
            b(l.au);
            return;
        }
        break; /* Loop/switch isn't completed */
_L6:
        if (bundle.getHost().equalsIgnoreCase("plus.google.com") && b(bundle))
        {
            a(bundle);
            p = bundle.toString();
            flag = true;
            continue; /* Loop/switch isn't completed */
        }
_L4:
        ebw.f("Babel", "Invalid uri for conversation Url");
        flag = false;
        if (true) goto _L8; else goto _L2
_L2:
        if (!TextUtils.isEmpty(j))
        {
            bundle = dbf.a(cey.a(j));
            if (bundle == null)
            {
                b(l.at);
                return;
            }
            bundle = bundle.a();
        } else
        {
            bundle = dbf.c(false);
            if (bundle.length == 0)
            {
                bundle = g.e(null);
                bundle.setAction("com.google.android.apps.hangouts.phone.addgoogleaccount");
                startActivity(bundle);
                finish();
                bundle = null;
            } else
            if (bundle.length == 1)
            {
                bundle = dbf.e(bundle[0]).a();
            } else
            {
                bundle = null;
            }
        }
        bundle = (new gxe()).b().a(bundle).a(gxj);
        r.a(bundle);
        return;
    }
}
