// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.libraries.social.settings.CheckBoxPreference;

public final class hem extends CheckBoxPreference
{

    private final hen c;

    public hem(Context context, int i, String s)
    {
        this(context, i, s, null);
    }

    public hem(Context context, int i, String s, Boolean boolean1)
    {
        super(context);
        Boolean boolean2 = boolean1;
        if (boolean1 == null)
        {
            boolean2 = Boolean.valueOf(false);
        }
        b(boolean2);
        c = new hen(context, i, s);
    }

    protected void a(boolean flag, Object obj)
    {
        a(c(((Boolean)obj).booleanValue()));
    }

    protected boolean b(boolean flag)
    {
        c.a(flag);
        return true;
    }

    protected boolean c(boolean flag)
    {
        return c.b(flag).booleanValue();
    }
}
