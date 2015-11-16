// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class gqb
{

    public static gqb a;
    SparseArray b;
    Map c;
    Map d;

    public gqb()
    {
        b = new SparseArray();
        c = new HashMap();
        d = new HashMap();
        c.put("position", new Property[] {
            gqh.e, gqh.f
        });
        d.put("position", new String[] {
            "x", "y"
        });
        c.put("scale", new Property[] {
            View.SCALE_X, View.SCALE_Y
        });
        d.put("scale", new String[] {
            "sx", "sy"
        });
        c.put("opacity", new Property[] {
            View.ALPHA
        });
        d.put("opacity", null);
    }

    static float a(gqc gqc1, Property property, double d1)
    {
        float f;
        if (!gqc1.a(property))
        {
            throw new gqd("Cannot animate position if stage size was not defined");
        }
        f = 1.0F;
        if (property != gqh.e) goto _L2; else goto _L1
_L1:
        f = gqc1.a;
_L4:
        return f * (float)d1;
_L2:
        if (property == gqh.f)
        {
            f = gqc1.b;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static String a(Context context, int i)
    {
        Context context1;
        Object obj;
        obj = null;
        context1 = ((Context) (obj));
        StringBuilder stringbuilder = new StringBuilder();
        context1 = ((Context) (obj));
        context = context.getResources().openRawResource(i);
        context1 = context;
        obj = new BufferedReader(new InputStreamReader(context));
_L2:
        context1 = context;
        String s = ((BufferedReader) (obj)).readLine();
        if (s == null)
        {
            break; /* Loop/switch isn't completed */
        }
        context1 = context;
        stringbuilder.append(s);
        if (true) goto _L2; else goto _L1
        context;
        if (context1 != null)
        {
            context1.close();
        }
        throw context;
_L1:
        context1 = context;
        obj = stringbuilder.toString();
        if (context != null)
        {
            context.close();
        }
        return ((String) (obj));
    }

    private Collection a(gqc gqc1)
    {
        JSONArray jsonarray = gqc1.c.getJSONArray("animations");
        ArrayList arraylist = new ArrayList();
        int j = jsonarray.length();
        for (int i = 0; i < j; i++)
        {
            a(gqc1, jsonarray.getJSONObject(i), ((Collection) (arraylist)));
        }

        return arraylist;
    }

    private void a(gqc gqc1, JSONObject jsonobject, Collection collection)
    {
        Object obj = gqc1.d.get(jsonobject.getString("id"));
        if (obj != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        JSONArray jsonarray;
        int i;
        int l;
        jsonarray = jsonobject.getJSONArray("animations");
        l = jsonarray.length();
        i = 0;
_L9:
        Keyframe akeyframe1[];
        Property aproperty[];
        String as[];
        int j;
        long l1;
        long l2;
        if (i >= l)
        {
            continue; /* Loop/switch isn't completed */
        }
        jsonobject = jsonarray.getJSONObject(i);
        l1 = (long)(jsonobject.getDouble("duration") * 1000D);
        l2 = (long)(jsonobject.optDouble("delay", 0.0D) * 1000D);
        String s = jsonobject.getString("property");
        aproperty = (Property[])c.get(s);
        as = (String[])d.get(s);
        float f;
        Keyframe akeyframe[];
        JSONArray jsonarray1;
        boolean flag;
        int k;
        int i1;
        if (as == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jsonarray1 = jsonobject.getJSONArray("keyframes");
        i1 = jsonarray1.length();
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_478;
        }
        j = 0;
_L7:
        if (j >= aproperty.length) goto _L4; else goto _L3
_L3:
        k = 0;
        jsonobject = null;
        akeyframe1 = null;
_L5:
        if (k >= i1)
        {
            break MISSING_BLOCK_LABEL_422;
        }
        JSONArray jsonarray2 = jsonarray1.getJSONArray(k);
        double d1;
        JSONObject jsonobject1;
        if (flag)
        {
            jsonobject1 = null;
        } else
        {
            jsonobject1 = jsonarray2.getJSONObject(1);
        }
        if (jsonobject1 != null && !jsonobject1.has(as[j]))
        {
            break MISSING_BLOCK_LABEL_422;
        }
        akeyframe = akeyframe1;
        if (akeyframe1 == null)
        {
            akeyframe = new Keyframe[i1];
        }
        f = (float)jsonarray2.getDouble(0);
        akeyframe1 = aproperty[j];
        if (flag)
        {
            d1 = jsonarray2.getDouble(1);
        } else
        {
            d1 = jsonobject1.getDouble(as[j]);
        }
        akeyframe[k] = Keyframe.ofFloat(f, a(gqc1, ((Property) (akeyframe1)), d1));
        if (jsonobject != null)
        {
            jsonobject.a(akeyframe[k - 1], akeyframe[k]);
            akeyframe[k].setInterpolator(jsonobject);
        }
        if (jsonarray2.length() < 3)
        {
            break MISSING_BLOCK_LABEL_417;
        }
        jsonobject = jsonarray2.getJSONObject(2);
        if (!jsonobject.getString("name").equals("cubic-bezier"))
        {
            break MISSING_BLOCK_LABEL_417;
        }
        jsonobject = new gqf((float)jsonobject.getDouble("x1"), (float)jsonobject.getDouble("y1"), (float)jsonobject.getDouble("x2"), (float)jsonobject.getDouble("y2"));
_L6:
        k++;
        akeyframe1 = akeyframe;
          goto _L5
        jsonobject = null;
          goto _L6
        if (akeyframe1 != null)
        {
            jsonobject = ObjectAnimator.ofPropertyValuesHolder(obj, new PropertyValuesHolder[] {
                PropertyValuesHolder.ofKeyframe(aproperty[j], akeyframe1)
            });
            jsonobject.setDuration(l1).setStartDelay(l2);
            collection.add(jsonobject);
        }
        j++;
          goto _L7
_L4:
        i++;
        if (true) goto _L9; else goto _L8
_L8:
        if (true) goto _L1; else goto _L10
_L10:
    }

    private Animator b(Context context, int i, Map map)
    {
        context = new gqc(this, context, i, map, -1F, -1F);
        map = new AnimatorSet();
        map.playTogether(a(context));
        map.addListener(new gqe(this, context));
        return map;
        context;
_L2:
        throw new gqd(context);
        context;
        continue; /* Loop/switch isn't completed */
        context;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public Animator a(Context context, int i, Map map)
    {
        return b(context, i, map);
    }
}
