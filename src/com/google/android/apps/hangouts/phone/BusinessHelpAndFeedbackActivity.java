// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import android.net.Uri;
import g;

// Referenced classes of package com.google.android.apps.hangouts.phone:
//            HelpAndFeedbackActivity

public class BusinessHelpAndFeedbackActivity extends HelpAndFeedbackActivity
{

    public BusinessHelpAndFeedbackActivity()
    {
    }

    protected String j()
    {
        return g.f("https://support.google.com/business/?hl=%locale%", "hangouts_business").toString();
    }
}
