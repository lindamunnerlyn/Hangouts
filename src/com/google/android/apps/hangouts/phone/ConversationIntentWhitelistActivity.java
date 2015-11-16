// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import ebk;
import ebw;

// Referenced classes of package com.google.android.apps.hangouts.phone:
//            ConversationIntentSecureActivity

public class ConversationIntentWhitelistActivity extends ConversationIntentSecureActivity
{

    public ConversationIntentWhitelistActivity()
    {
    }

    protected boolean g()
    {
        String s = getCallingPackage();
        if (s == null)
        {
            ebw.g("Babel", "must use startActivityForResult");
            return false;
        }
        if (!ebk.a(this, s))
        {
            ebw.g("Babel", "Bad signature");
            return false;
        } else
        {
            return true;
        }
    }
}
