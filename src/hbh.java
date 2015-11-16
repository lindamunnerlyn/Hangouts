// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.libraries.social.login.LoginActivity;

public final class hbh
{

    private final Context a;
    private hbo b;
    private Intent c;
    private Bundle d;

    public hbh(Context context)
    {
        a = context;
    }

    public Intent a()
    {
        Intent intent = new Intent(a, com/google/android/libraries/social/login/LoginActivity);
        intent.putExtra("login_request", b);
        intent.putExtra("redirect_intent", c);
        intent.putExtra("redirect_intent_options", d);
        return intent;
    }

    public hbh a(hbo hbo)
    {
        b = hbo;
        return this;
    }
}
