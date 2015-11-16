// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Property;
import android.util.SparseArray;
import java.util.Map;
import org.json.JSONObject;

final class gun
{

    float a;
    float b;
    JSONObject c;
    Map d;
    final gum e;

    public gun(gum gum1, Context context, int i, Map map, float f, float f1)
    {
        e = gum1;
        super();
        a = -1F;
        b = -1F;
        JSONObject jsonobject1 = (JSONObject)gum1.b.get(i);
        JSONObject jsonobject = jsonobject1;
        if (jsonobject1 == null)
        {
            jsonobject = new JSONObject(gum.a(context, i));
            gum1.b.put(i, jsonobject);
        }
        c = jsonobject;
        d = map;
    }

    public boolean a(Property property)
    {
        return (a != -1F || property != gus.e) && (b != -1F || property != gus.f);
    }
}
