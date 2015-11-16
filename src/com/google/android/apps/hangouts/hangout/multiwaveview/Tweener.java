// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.hangout.multiwaveview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import gz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Tweener
{

    private static final boolean DEBUG = false;
    private static final String TAG = "Tweener";
    private static android.animation.Animator.AnimatorListener mCleanupListener = new _cls1();
    private static Map sTweens = new gz();
    ObjectAnimator animator;

    public Tweener(ObjectAnimator objectanimator)
    {
        animator = objectanimator;
    }

    private static void remove(Animator animator1)
    {
        Iterator iterator = sTweens.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (((Tweener)((java.util.Map.Entry)iterator.next()).getValue()).animator != animator1)
            {
                continue;
            }
            iterator.remove();
            break;
        } while (true);
    }

    private static transient void replace(ArrayList arraylist, Object aobj[])
    {
        int j = aobj.length;
        int i = 0;
        while (i < j) 
        {
            Object obj = aobj[i];
            obj = (Tweener)sTweens.get(obj);
            if (obj != null)
            {
                ((Tweener) (obj)).animator.cancel();
                if (arraylist != null)
                {
                    ((Tweener) (obj)).animator.setValues((PropertyValuesHolder[])arraylist.toArray(new PropertyValuesHolder[arraylist.size()]));
                } else
                {
                    sTweens.remove(obj);
                }
            }
            i++;
        }
    }

    public static void reset()
    {
        sTweens.clear();
    }

    public static transient Tweener to(Object obj, long l, Object aobj[])
    {
        Object obj1;
        Object obj2;
        Object obj3;
        ArrayList arraylist;
        int i;
        long l1;
        l1 = 0L;
        obj1 = null;
        obj2 = null;
        obj3 = null;
        arraylist = new ArrayList(aobj.length / 2);
        i = 0;
_L2:
        if (i >= aobj.length)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!(aobj[i] instanceof String))
        {
            obj = String.valueOf(aobj[i]);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(obj).length() + 22)).append("Key must be a string: ").append(((String) (obj))).toString());
        }
        Object obj4 = (String)aobj[i];
        Object obj6 = aobj[i + 1];
        if ("simultaneousTween".equals(obj4))
        {
            break MISSING_BLOCK_LABEL_681;
        }
        if ("ease".equals(obj4))
        {
            obj4 = (TimeInterpolator)obj6;
            obj3 = obj1;
            obj1 = obj4;
        } else
        if ("onUpdate".equals(obj4) || "onUpdateListener".equals(obj4))
        {
            obj4 = (android.animation.ValueAnimator.AnimatorUpdateListener)obj6;
            obj1 = obj3;
            obj3 = obj4;
        } else
        if ("onComplete".equals(obj4) || "onCompleteListener".equals(obj4))
        {
            obj4 = (android.animation.Animator.AnimatorListener)obj6;
            obj2 = obj3;
            obj3 = obj1;
            obj1 = obj2;
            obj2 = obj4;
        } else
        if ("delay".equals(obj4))
        {
            l1 = ((Number)obj6).longValue();
            obj4 = obj1;
            obj1 = obj3;
            obj3 = obj4;
        } else
        {
            if ("syncWith".equals(obj4))
            {
                break MISSING_BLOCK_LABEL_681;
            }
            if (obj6 instanceof float[])
            {
                arraylist.add(PropertyValuesHolder.ofFloat(((String) (obj4)), new float[] {
                    ((float[])obj6)[0], ((float[])obj6)[1]
                }));
                obj4 = obj1;
                obj1 = obj3;
                obj3 = obj4;
            } else
            if (obj6 instanceof int[])
            {
                arraylist.add(PropertyValuesHolder.ofInt(((String) (obj4)), new int[] {
                    ((int[])obj6)[0], ((int[])obj6)[1]
                }));
                obj4 = obj1;
                obj1 = obj3;
                obj3 = obj4;
            } else
            if (obj6 instanceof Number)
            {
                arraylist.add(PropertyValuesHolder.ofFloat(((String) (obj4)), new float[] {
                    ((Number)obj6).floatValue()
                }));
                obj4 = obj1;
                obj1 = obj3;
                obj3 = obj4;
            } else
            {
                obj = String.valueOf(obj6.getClass());
                throw new IllegalArgumentException((new StringBuilder(String.valueOf(obj4).length() + 35 + String.valueOf(obj).length())).append("Bad argument for key \"").append(((String) (obj4))).append("\" with value ").append(((String) (obj))).toString());
            }
        }
_L3:
        i += 2;
        obj4 = obj3;
        obj3 = obj1;
        obj1 = obj4;
        if (true) goto _L2; else goto _L1
_L1:
        Tweener tweener = (Tweener)sTweens.get(obj);
        if (tweener == null)
        {
            aobj = ObjectAnimator.ofPropertyValuesHolder(obj, (PropertyValuesHolder[])arraylist.toArray(new PropertyValuesHolder[arraylist.size()]));
            tweener = new Tweener(((ObjectAnimator) (aobj)));
            sTweens.put(obj, tweener);
            obj = tweener;
        } else
        {
            aobj = ((Tweener)sTweens.get(obj)).animator;
            replace(arraylist, new Object[] {
                obj
            });
            obj = tweener;
        }
        if (obj3 != null)
        {
            ((ObjectAnimator) (aobj)).setInterpolator(((TimeInterpolator) (obj3)));
        }
        ((ObjectAnimator) (aobj)).setStartDelay(l1);
        ((ObjectAnimator) (aobj)).setDuration(l);
        if (obj1 != null)
        {
            ((ObjectAnimator) (aobj)).removeAllUpdateListeners();
            ((ObjectAnimator) (aobj)).addUpdateListener(((android.animation.ValueAnimator.AnimatorUpdateListener) (obj1)));
        }
        if (obj2 != null)
        {
            ((ObjectAnimator) (aobj)).removeAllListeners();
            ((ObjectAnimator) (aobj)).addListener(((android.animation.Animator.AnimatorListener) (obj2)));
        }
        ((ObjectAnimator) (aobj)).addListener(mCleanupListener);
        return ((Tweener) (obj));
        Object obj5 = obj1;
        obj1 = obj3;
        obj3 = obj5;
          goto _L3
    }

    transient Tweener from(Object obj, long l, Object aobj[])
    {
        return to(obj, l, aobj);
    }



    private class _cls1 extends AnimatorListenerAdapter
    {

        public void onAnimationCancel(Animator animator1)
        {
            Tweener.remove(animator1);
        }

        public void onAnimationEnd(Animator animator1)
        {
            Tweener.remove(animator1);
        }

        _cls1()
        {
        }
    }

}
