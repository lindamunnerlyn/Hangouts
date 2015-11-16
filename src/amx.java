// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.util.Patterns;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class amx
    implements Serializable
{

    public String a;

    public amx()
    {
        a = "";
    }

    public abstract and a();

    public abstract Collection b();

    public abstract String c();

    public abstract Collection d();

    public abstract String e();

    public abstract String f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract String i();

    public abstract Collection j();

    public abstract String k();

    public abstract boolean l();

    public abstract String m();

    public abstract boolean n();

    public abstract boolean o();

    public Collection p()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = b().iterator(); iterator.hasNext(); arraylist.add(dbl.a(((and)iterator.next()).b()))) { }
        amw amw1;
        for (Iterator iterator1 = j().iterator(); iterator1.hasNext(); arraylist.add(dbl.a(amw1.a(), amw1.e())))
        {
            amw1 = (amw)iterator1.next();
        }

        return arraylist;
    }

    public boolean q()
    {
        return !b().isEmpty();
    }

    public int r()
    {
        if (TextUtils.isEmpty(a))
        {
            return amy.a;
        }
        if (Patterns.EMAIL_ADDRESS.matcher(a).matches())
        {
            return amy.c;
        }
        if (eey.m(a) != null)
        {
            return amy.d;
        }
        for (Iterator iterator = d().iterator(); iterator.hasNext();)
        {
            if (((amv)iterator.next()).b().contains(a))
            {
                return amy.c;
            }
        }

        for (Iterator iterator1 = b().iterator(); iterator1.hasNext();)
        {
            if (((and)iterator1.next()).d().contains(a))
            {
                return amy.d;
            }
        }

        return amy.b;
    }

    public String toString()
    {
        String s = String.valueOf(eev.b(e()));
        String s1 = String.valueOf(eev.b(f()));
        String s2 = String.valueOf(Arrays.toString(j().toArray()));
        String s3 = String.valueOf(eev.b(k()));
        String s4 = String.valueOf(eev.b(m()));
        String s5 = String.valueOf(Arrays.toString(d().toArray()));
        String s6 = String.valueOf(Arrays.toString(b().toArray()));
        String s7 = String.valueOf(Arrays.toString(p().toArray()));
        return (new StringBuilder(String.valueOf(s).length() + 126 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(s5).length() + String.valueOf(s6).length() + String.valueOf(s7).length())).append("HangoutsContact {name: ").append(s).append(" | avatarUrl: ").append(s1).append(" | gaias: ").append(s2).append(" | contactLookupKey: ").append(s3).append(" | contactId: ").append(s4).append(" | emails: ").append(s5).append(" | phoneNumbers: ").append(s6).append(" | inviteeIds: ").append(s7).append("}").toString();
    }
}
