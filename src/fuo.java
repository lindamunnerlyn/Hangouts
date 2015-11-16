// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Scope;

public final class fuo
{

    public static final emx a;
    public static final emx b;
    public static final emu c;
    static final emu d;
    public static final Scope e = new Scope("profile");
    public static final Scope f = new Scope("email");
    public static final emt g;
    public static final emt h;
    public static final fur i = new fur();

    static 
    {
        a = new emx();
        b = new emx();
        c = new fup();
        d = new fuq();
        g = new emt("SignIn.API", c, a);
        h = new emt("SignIn.INTERNAL_API", d, b);
    }
}
