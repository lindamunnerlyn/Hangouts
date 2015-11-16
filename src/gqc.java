// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Property;
import android.util.SparseArray;
import java.util.Map;
import org.json.JSONObject;

final class gqc
{

    float a;
    float b;
    JSONObject c;
    Map d;
    final gqb e;

    public gqc(gqb gqb1, Context context, int i, Map map, float f, float f1)
    {
        e = gqb1;
        super();
        a = -1F;
        b = -1F;
        JSONObject jsonobject1 = (JSONObject)gqb1.b.get(i);
        JSONObject jsonobject = jsonobject1;
        if (jsonobject1 == null)
        {
            jsonobject = new JSONObject(gqb.a(context, i));
            gqb1.b.put(i, jsonobject);
        }
        c = jsonobject;
        d = map;
    }

    public boolean a(Property property)
    {
        return (a != -1F || property != gqh.e) && (b != -1F || property != gqh.f);
    }
}
