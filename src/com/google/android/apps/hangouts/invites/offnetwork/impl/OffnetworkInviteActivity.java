// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.invites.offnetwork.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import aoa;
import bkm;
import bxj;
import com.google.android.apps.hangouts.phone.BabelGatewayActivity;
import dcn;
import g;
import gqu;
import grn;
import h;
import java.util.Iterator;
import java.util.List;

public class OffnetworkInviteActivity extends bkm
{

    private final gqu n;

    public OffnetworkInviteActivity()
    {
        n = (new grn(this, r)).a(q);
    }

    private static ComponentName a(Context context)
    {
label0:
        {
            String s = android.provider.Telephony.Sms.getDefaultSmsPackage(context);
            if (s == null)
            {
                break label0;
            }
            context = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.SENDTO", Uri.fromParts("smsto", "", null)), 0).iterator();
            ResolveInfo resolveinfo;
            do
            {
                if (!context.hasNext())
                {
                    break label0;
                }
                resolveinfo = (ResolveInfo)context.next();
            } while (!s.equals(resolveinfo.activityInfo.packageName));
            return new ComponentName(s, resolveinfo.activityInfo.name);
        }
        return null;
    }

    public static Intent a(Context context, String s, String s1)
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        if (android.os.Build.VERSION.SDK_INT >= 19 && android.provider.Telephony.Sms.getDefaultSmsPackage(context) != null)
        {
            context = a(context);
            if (context != null)
            {
                intent.setComponent(context);
            }
        }
        context = String.valueOf(s1);
        if (context.length() != 0)
        {
            context = "sms:".concat(context);
        } else
        {
            context = new String("sms:");
        }
        intent.setData(Uri.parse(context));
        intent.putExtra("sms_body", s);
        intent.putExtra("android.intent.extra.TEXT", s);
        return intent;
    }

    public static Intent a(String s, String s1, int i, int j, String s2)
    {
        Intent intent = new Intent(g.nU, com/google/android/apps/hangouts/invites/offnetwork/impl/OffnetworkInviteActivity);
        intent.putExtra("conversation_id", s);
        intent.putExtra("phone_number", s1);
        intent.putExtra("account_to_use_in_invite", i);
        intent.putExtra("account_to_deliver_sms", j);
        if (!TextUtils.isEmpty(s2))
        {
            intent.putExtra("offnetwork_invite_url", s2);
        }
        return intent;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        aoa aoa1 = dcn.e(n.a());
        String s = getIntent().getStringExtra("conversation_id");
        String s2 = getIntent().getStringExtra("phone_number");
        Object obj = dcn.e(getIntent().getIntExtra("account_to_use_in_invite", -1));
        bundle = ((Bundle) (obj));
        if (obj == null)
        {
            bundle = aoa1;
        }
        int i = getIntent().getIntExtra("account_to_deliver_sms", -1);
        aoa aoa2 = dcn.e(i);
        String s1 = getIntent().getStringExtra("offnetwork_invite_url");
        obj = s1;
        if (TextUtils.isEmpty(s1))
        {
            obj = bxj.a(bundle);
        }
        obj = getResources().getString(h._fldif, new Object[] {
            obj
        });
        if (aoa2 == null)
        {
            g.a(bundle, 1896);
            bundle = a(this, ((String) (obj)), s2);
        } else
        {
            if (aoa2.equals(aoa1))
            {
                g.a(bundle, 1898);
                bundle = s;
            } else
            {
                g.a(bundle, 1897);
                bundle = null;
            }
            bundle = BabelGatewayActivity.a(this, i, bundle, s2, ((String) (obj)));
        }
        startActivity(bundle);
        finish();
    }
}
